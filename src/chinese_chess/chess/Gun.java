package chinese_chess.chess;

import java.awt.Point;
import java.util.Iterator;

import chinese_chess.biz.ChessPanel;
import chinese_chess.util.Constant;

public class Gun extends Chess{

	public Gun(Point point, Camp camp, Type type) {
		super(point, camp, type);
	}
/*
 * x,y是目标点位的下标
 */
	@Override
	public boolean move(int x, int y) {
		//获取到当前点位
		int xYuan=(getPoint().x-Constant.INITX)/Constant.CHESS_SIZE;
		int yYuan=(getPoint().y-Constant.INITY)/Constant.CHESS_SIZE;
		//通过循环来判断原来的坐标到目标点位坐标有多少棋子
		int chezz = -1;//如果一会判断完还是-1就表示不在一条直线上
		//竖着走
		if(xYuan==x) {
			chezz =0;
			if(yYuan<y) {//向下走
				  for(int i = yYuan+1;i<y;i++) {
					  if(ChessPanel.allChess[i][x]!=null) {
						  chezz++;
					  }
				  }
			}else if(yYuan>y) {//向上走
				  for(int i = y+1;i<yYuan;i++) {
					  if(ChessPanel.allChess[i][x]!=null) {
						  chezz++;
					  }
				  }
			}
		}
		//横着走
		if(yYuan==y) {
			chezz =0;
			if(xYuan<x) {//向右走
				  for(int i = xYuan+1;i<x;i++) {
					  if(ChessPanel.allChess[y][i]!=null) {
						  chezz++;
					  }
				  }
			}else if(xYuan>x) {//向左走
				  for(int i = x+1;i<xYuan;i++) {
					  if(ChessPanel.allChess[y][i]!=null) {
						  chezz++;
					  }
				  }
			}
		}
		System.out.println(chezz+"-----------");
		if(chezz==0&&ChessPanel.allChess[y][x]==null) {//如果炮台为0并且目标位置没有棋子，则可以移动过去
			return true;
		}
		//炮台数为1，目标点位有棋子
		if(chezz==1&&ChessPanel.allChess[y][x]!=null) {
			return true;
		}
		return false;
	}

}
