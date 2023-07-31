package chinese_chess.biz;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

import chinese_chess.chess.Boss;
import chinese_chess.chess.Camp;
import chinese_chess.chess.Car;
import chinese_chess.chess.Chess;
import chinese_chess.chess.Elephant;
import chinese_chess.chess.Guard;
import chinese_chess.chess.Gun;
import chinese_chess.chess.Horse;
import chinese_chess.chess.Soldier;
import chinese_chess.chess.Type;
import chinese_chess.util.AudioUtil;
import chinese_chess.util.Constant;
import chinese_chess.util.ImageUtil;

/**
 * 这个是桌布类，棋子棋盘都在这里绘制
 * 
 * @author liaojiachao
 *
 */
public class ChessPanel extends JPanel {
	public static Chess[][] allChess = new Chess[10][9];// 所以的棋盘点位数组，存放所有棋子
	Chess currentChess = null;// 当前已经选中的棋子，默认为空表示没有选中任何棋子
	boolean isTurn = true;// 红方先行
	int winner = 0;// 未分胜负
	boolean flag = true;

	// 绘制图案

	@Override
	public void paint(Graphics g) {

		g.drawImage(ImageUtil.getImage("images/bg.jpg"), 0, 0, null);
//		 g.drawImage(ImageUtil.getImage("images/chessBg.jpg"),0,0,null);
//		  g.setColor(Color.black); g.setFont(new Font("宋体", Font.BOLD, 25));
//		  g.drawString("車", 12, 32);
		// 画棋子
		for (int i = 0; i < allChess.length; i++) {
			for (int j = 0; j < allChess[i].length; j++) {
				if (allChess[i][j] != null) {// 如果有棋子就绘制
					allChess[i][j].draw(g);
				}
			}
		}
		// 绘制选中棋子的边框
		if (currentChess != null) {
			currentChess.drawBorder(g);
		}
		// 绘制输赢
		if (winner == 1) {// 红方胜
			g.setColor(Color.red);
			g.setFont(new Font("黑体", Font.BOLD, 60));
			g.drawString("红方胜利", 134, 312);
		} else if (winner == 2) {
			g.setColor(Color.black);
			g.setFont(new Font("黑体", Font.BOLD, 60));
			g.drawString("黑方胜利", 135, 312);
		}
	}

	// 面板初始化后首先执行这个方法
	public void start() {
		// 给这个面板绑定一个鼠标点击事件
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (flag == false) {
					return;
				}
				int x = e.getX();// 鼠标点击事件的横坐标
				int y = e.getY();// 鼠标点击事件的纵坐标
				// 坐标转下标
				int ax = (x - Constant.INITX) / Constant.CHESS_SIZE;
				int ay = (y - Constant.INITY) / Constant.CHESS_SIZE;
				System.out.println("点击坐标是" + x + "," + y + "----" + "下标" + "[" + ay + "," + ax + "]");
				// 点击的棋子是谁
				Chess selectChess = allChess[ay][ax];
				System.out.println(selectChess);
				if (selectChess != null) {
					// 点棋子
					if (currentChess == null) {// 选子
						if (isTurn == true && selectChess.getCamp() == Camp.红方
								|| isTurn == false && selectChess.getCamp() == Camp.黑方) {
							currentChess = selectChess;
							AudioUtil.play(Constant.SELECT);
						}
					} else {
						// 换子或者吃子
						if (selectChess.getCamp() == currentChess.getCamp()) {
							// 换子
							currentChess = selectChess;

						} else {
							// 吃子
							if (!currentChess.move(ax, ay)) {
								return;// 不满足下棋的规则
							}
							// 能吃子
							// 移子的逻辑
							// 1.先让自己消失----先把currentChess的坐标转为下标
							int x0 = (currentChess.getPoint().x - Constant.INITX) / Constant.CHESS_SIZE;
							int y0 = (currentChess.getPoint().y - Constant.INITX) / Constant.CHESS_SIZE;
							allChess[y0][x0] = null;
							// 2.把吃棋的棋子的坐标转变为被吃棋子的坐标
							currentChess.setPoint(selectChess.getPoint());
							// 3.把被吃的棋子
							allChess[ay][ax] = currentChess;
							// 4.把currentChess变为空
							currentChess = null;
							// 5.攻守之位异也
							isTurn = !isTurn;
							// 判断输赢
							if (selectChess.getType() == Type.将) {
								flag = false;
								if (selectChess.getCamp() == Camp.红方) {
									// 黑方胜利
									winner = 2;
								} else {
									// 红方胜利
									winner = 1;
								}
							}
						}
					}
				} else {
					// 点空白
					// 判断是否已经选中了一颗棋子
					if (currentChess == null) {
						return;
					}
					if (!currentChess.move(ax, ay)) {
						return;// 不满足规则
					}
					// 移子的逻辑
					// 1.先让自己消失----先把currentChess的坐标转为下标
					int x0 = (currentChess.getPoint().x - Constant.INITX) / Constant.CHESS_SIZE;
					int y0 = (currentChess.getPoint().y - Constant.INITX) / Constant.CHESS_SIZE;
					allChess[y0][x0] = null;
					// 2.把需要移动的棋子的坐标转变为目标点位的坐标
					int x1 = ax * Constant.CHESS_SIZE + Constant.INITX;
					int y1 = ay * Constant.CHESS_SIZE + Constant.INITY;
					currentChess.setPoint(new Point(x1, y1));
					// 3.把棋子移动到目标位置
					allChess[ay][ax] = currentChess;
					// 4.把currentChess变为空
					currentChess = null;
					// 5.攻守之位异也
					isTurn = !isTurn;

				}

				// 重绘
				repaint();
			}
		});
	}

//构造函数的时候就初始化32个棋子
	public ChessPanel() {
		initChess();
	}

	// 初始化棋子的方法
	private void initChess() {
		Chess redCar1 = new Car(new Point(Constant.INITX, Constant.INITY), Camp.红方, Type.车);
		Chess redHorse1 = new Horse(new Point(Constant.INITX + Constant.CHESS_SIZE * 1, Constant.INITY), Camp.红方,
				Type.马);
		Chess redElephant1 = new Elephant(new Point(Constant.INITX + Constant.CHESS_SIZE * 2, Constant.INITY), Camp.红方,
				Type.象);
		Chess redGuard1 = new Guard(new Point(Constant.INITX + Constant.CHESS_SIZE * 3, Constant.INITY), Camp.红方,
				Type.士);
		Chess redBoss = new Boss(new Point(Constant.INITX + Constant.CHESS_SIZE * 4, Constant.INITY), Camp.红方, Type.将);
		Chess redGuard2 = new Guard(new Point(Constant.INITX + Constant.CHESS_SIZE * 5, Constant.INITY), Camp.红方,
				Type.士);
		Chess redElephant2 = new Elephant(new Point(Constant.INITX + Constant.CHESS_SIZE * 6, Constant.INITY), Camp.红方,
				Type.象);
		Chess redHorse2 = new Horse(new Point(Constant.INITX + Constant.CHESS_SIZE * 7, Constant.INITY), Camp.红方,
				Type.马);
		Chess redCar2 = new Car(new Point(Constant.INITX + Constant.CHESS_SIZE * 8, Constant.INITY), Camp.红方, Type.车);
		// 两个炮
		Chess redGun1 = new Gun(
				new Point(Constant.INITX + Constant.CHESS_SIZE * 1, Constant.INITY + Constant.CHESS_SIZE * 2), Camp.红方,
				Type.砲);
		Chess redGun2 = new Gun(
				new Point(Constant.INITX + Constant.CHESS_SIZE * 7, Constant.INITY + Constant.CHESS_SIZE * 2), Camp.红方,
				Type.砲);
		// 兵
		Chess redSoldier1 = new Soldier(
				new Point(Constant.INITX + Constant.CHESS_SIZE * 0, Constant.INITY + Constant.CHESS_SIZE * 3), Camp.红方,
				Type.卒);
		Chess redSoldier2 = new Soldier(
				new Point(Constant.INITX + Constant.CHESS_SIZE * 2, Constant.INITY + Constant.CHESS_SIZE * 3), Camp.红方,
				Type.卒);
		Chess redSoldier3 = new Soldier(
				new Point(Constant.INITX + Constant.CHESS_SIZE * 4, Constant.INITY + Constant.CHESS_SIZE * 3), Camp.红方,
				Type.卒);
		Chess redSoldier4 = new Soldier(
				new Point(Constant.INITX + Constant.CHESS_SIZE * 6, Constant.INITY + Constant.CHESS_SIZE * 3), Camp.红方,
				Type.卒);
		Chess redSoldier5 = new Soldier(
				new Point(Constant.INITX + Constant.CHESS_SIZE * 8, Constant.INITY + Constant.CHESS_SIZE * 3), Camp.红方,
				Type.卒);
		allChess[0][0] = redCar1;
		allChess[0][1] = redHorse1;
		allChess[0][2] = redElephant1;
		allChess[0][3] = redGuard1;
		allChess[0][4] = redBoss;
		allChess[0][5] = redGuard2;
		allChess[0][6] = redElephant2;
		allChess[0][7] = redHorse2;
		allChess[0][8] = redCar2;
		// 炮
		allChess[2][1] = redGun1;
		allChess[2][7] = redGun2;
		// 兵
		allChess[3][0] = redSoldier1;
		allChess[3][2] = redSoldier2;
		allChess[3][4] = redSoldier3;
		allChess[3][6] = redSoldier4;
		allChess[3][8] = redSoldier5;

		// 黑方
		Chess blackCar1 = new Car(new Point(Constant.INITX, Constant.INITY + Constant.CHESS_SIZE * 9), Camp.黑方, Type.车);
		Chess blackHorse1 = new Horse(
				new Point(Constant.INITX + Constant.CHESS_SIZE * 1, Constant.INITY + Constant.CHESS_SIZE * 9), Camp.黑方,
				Type.马);
		Chess blackElephant1 = new Elephant(
				new Point(Constant.INITX + Constant.CHESS_SIZE * 2, Constant.INITY + Constant.CHESS_SIZE * 9), Camp.黑方,
				Type.象);
		Chess blackGuard1 = new Guard(
				new Point(Constant.INITX + Constant.CHESS_SIZE * 3, Constant.INITY + Constant.CHESS_SIZE * 9), Camp.黑方,
				Type.士);
		Chess blackBoss = new Boss(
				new Point(Constant.INITX + Constant.CHESS_SIZE * 4, Constant.INITY + Constant.CHESS_SIZE * 9), Camp.黑方,
				Type.将);
		Chess blackGuard2 = new Guard(
				new Point(Constant.INITX + Constant.CHESS_SIZE * 5, Constant.INITY + Constant.CHESS_SIZE * 9), Camp.黑方,
				Type.士);
		Chess blackElephant2 = new Elephant(
				new Point(Constant.INITX + Constant.CHESS_SIZE * 6, Constant.INITY + Constant.CHESS_SIZE * 9), Camp.黑方,
				Type.象);
		Chess blackHorse2 = new Horse(
				new Point(Constant.INITX + Constant.CHESS_SIZE * 7, Constant.INITY + Constant.CHESS_SIZE * 9), Camp.黑方,
				Type.马);
		Chess blackCar2 = new Car(
				new Point(Constant.INITX + Constant.CHESS_SIZE * 8, Constant.INITY + Constant.CHESS_SIZE * 9), Camp.黑方,
				Type.车);
		// 两个炮
		Chess blackGun1 = new Gun(
				new Point(Constant.INITX + Constant.CHESS_SIZE * 1, Constant.INITY + Constant.CHESS_SIZE * 7), Camp.黑方,
				Type.砲);
		Chess blackGun2 = new Gun(
				new Point(Constant.INITX + Constant.CHESS_SIZE * 7, Constant.INITY + Constant.CHESS_SIZE * 7), Camp.黑方,
				Type.砲);
		// 兵
		Chess blackSoldier1 = new Soldier(
				new Point(Constant.INITX + Constant.CHESS_SIZE * 0, Constant.INITY + Constant.CHESS_SIZE * 6), Camp.黑方,
				Type.卒);
		Chess blackSoldier2 = new Soldier(
				new Point(Constant.INITX + Constant.CHESS_SIZE * 2, Constant.INITY + Constant.CHESS_SIZE * 6), Camp.黑方,
				Type.卒);
		Chess blackSoldier3 = new Soldier(
				new Point(Constant.INITX + Constant.CHESS_SIZE * 4, Constant.INITY + Constant.CHESS_SIZE * 6), Camp.黑方,
				Type.卒);
		Chess blackSoldier4 = new Soldier(
				new Point(Constant.INITX + Constant.CHESS_SIZE * 6, Constant.INITY + Constant.CHESS_SIZE * 6), Camp.黑方,
				Type.卒);
		Chess blackSoldier5 = new Soldier(
				new Point(Constant.INITX + Constant.CHESS_SIZE * 8, Constant.INITY + Constant.CHESS_SIZE * 6), Camp.黑方,
				Type.卒);
		allChess[9][0] = blackCar1;
		allChess[9][1] = blackHorse1;
		allChess[9][2] = blackElephant1;
		allChess[9][3] = blackGuard1;
		allChess[9][4] = blackBoss;
		allChess[9][5] = blackGuard2;
		allChess[9][6] = blackElephant2;
		allChess[9][7] = blackHorse2;
		allChess[9][8] = blackCar2;
		// 炮
		allChess[7][1] = blackGun1;
		allChess[7][7] = blackGun2;
		// 兵
		allChess[6][0] = blackSoldier1;
		allChess[6][2] = blackSoldier2;
		allChess[6][4] = blackSoldier3;
		allChess[6][6] = blackSoldier4;
		allChess[6][8] = blackSoldier5;
	}

}
