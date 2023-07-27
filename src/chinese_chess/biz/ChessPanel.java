package chinese_chess.biz;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;

import javax.swing.JPanel;

import chinese_chess.chess.Boss;
import chinese_chess.chess.Camp;
import chinese_chess.chess.Car;
import chinese_chess.chess.Chess;
import chinese_chess.chess.Elephant;
import chinese_chess.chess.Guard;
import chinese_chess.chess.Horse;
import chinese_chess.chess.Type;
import chinese_chess.util.Constant;
import chinese_chess.util.ImageUtil;

/**
 * 这个是桌布类，棋子棋盘都在这里绘制
 * 
 * @author liaojiachao
 *
 */
public class ChessPanel extends JPanel {
	Chess[][] allChess = new Chess[10][9];// 所以的棋盘点位数组，存放所有棋子
	// 绘制图案

	@Override
	public void paint(Graphics g) {
		
		  g.drawImage(ImageUtil.getImage("images/bg.jpg"),0,0,null);
//		 g.drawImage(ImageUtil.getImage("images/chessBg.jpg"),0,0,null);
//		  g.setColor(Color.red); g.setFont(new Font("宋体", Font.BOLD, 25));
//		  g.drawString("車", 12, 32);
		  //画棋子
		  for (int i = 0; i < allChess.length; i++) {
			for (int j = 0; j < allChess[i].length; j++) {
				if(allChess[i][j]!=null) {//如果有棋子就绘制
					allChess[i][j].draw(g);
				}
			}
		}
		 
	}

	public void start() {

	}

//构造函数的时候就初始化32个棋子
	public ChessPanel() {
		initChess();
	}

	// 初始化棋子的方法
	private void initChess() {
		Chess redCar1= new Car(new Point(Constant.INITX,Constant.INITY), Camp.红方, Type.车);
		Chess redHorse1= new Horse(new Point(Constant.INITX+Constant.CHESS_SIZE*1,Constant.INITY), Camp.红方, Type.马);
		Chess redElephant1= new Elephant(new Point(Constant.INITX+Constant.CHESS_SIZE*2,Constant.INITY), Camp.红方, Type.象);
		Chess redGuard1= new Guard(new Point(Constant.INITX+Constant.CHESS_SIZE*3,Constant.INITY), Camp.红方, Type.士);
		Chess redBoss= new Boss(new Point(Constant.INITX+Constant.CHESS_SIZE*4,Constant.INITY), Camp.红方, Type.将);
		Chess redGuard2= new Guard(new Point(Constant.INITX+Constant.CHESS_SIZE*5,Constant.INITY), Camp.红方, Type.士);
		Chess redElephant2= new Elephant(new Point(Constant.INITX+Constant.CHESS_SIZE*6,Constant.INITY), Camp.红方, Type.象);
		Chess redHorse2= new Horse(new Point(Constant.INITX+Constant.CHESS_SIZE*7,Constant.INITY), Camp.红方, Type.马);
		Chess redCar2= new Car(new Point(Constant.INITX+Constant.CHESS_SIZE*8,Constant.INITY), Camp.红方, Type.车);
		allChess[0][0]= redCar1;
		allChess[0][1]= redHorse1;
		allChess[0][2]= redElephant1;
		allChess[0][3]= redGuard1;
		allChess[0][4]= redBoss;
		allChess[0][5]= redGuard2;
		allChess[0][6]= redElephant2;
		allChess[0][7]= redHorse2;
		allChess[0][8]= redCar2;
		//1.41
	}

}
