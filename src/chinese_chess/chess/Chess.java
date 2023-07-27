package chinese_chess.chess;
/*
 * 棋子类，是所以棋子的父类，规定了棋子的属性和方法
 */

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;

import chinese_chess.util.Constant;
import chinese_chess.util.ImageUtil;

public abstract class Chess {
	private Point point;// 棋子坐标
	private Camp camp;// 阵营
	private Type type;// 棋子类型

	public abstract boolean move(int x, int y);// 棋子移动的方法

	public Chess(Point point, Camp camp, Type type) {
		this.point = point;
		this.camp = camp;
		this.type = type;
	}

	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}

	public Camp getCamp() {
		return camp;
	}

	public void setCamp(Camp camp) {
		this.camp = camp;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public void draw(Graphics g) {
		//绘制棋子背景
		g.drawImage(ImageUtil.getImage(Constant.CHESSBG),point.x, point.y, null);
		//绘制棋子
		g.setColor(camp==camp.红方?Color.red:Color.black);
		g.setFont(new Font(Constant.FONT_FAMILY, Font.BOLD, Constant.FONT_SIZE));
		g.drawString(getWord(), point.x+Constant.FONTR, point.y+Constant.FONTB);
	}

	private String getWord() {
		String word = "";
		if(camp==Camp.黑方) {
			word = type.toString();
		}else {
			switch(type) {
			case 车:
				word="車";
				break;
			case 马:
				word="馬";
				break;
			case 象:
				word="相";
				break;
			case 士:
				word="仕";
				break;
			case 将:
				word="帥";
				break;
			case 砲:
				word="炮";
				break;
			case 卒:
				word="兵";
				break;
				
			}
		}
		return word;
	};

}
