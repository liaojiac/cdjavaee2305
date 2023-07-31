package chinese_chess.chess;

import java.awt.Point;

import chinese_chess.biz.ChessPanel;
import chinese_chess.util.Constant;

public class Car extends Chess{

	public Car(Point point, Camp camp, Type type) {
		super(point, camp, type);

	}

	@Override
	public boolean move(int x,int y) {
		//获取到当前点位
				int xYuan=(getPoint().x-Constant.INITX)/Constant.CHESS_SIZE;
				int yYuan=(getPoint().y-Constant.INITY)/Constant.CHESS_SIZE;
				//通过循环来判断原来的坐标到目标点位坐标有多少棋子
				
				//竖着走
				if(xYuan==x) {
					
					if(yYuan<y) {//向下走
						  for(int i = yYuan+1;i<y;i++) {
							  if(ChessPanel.allChess[i][x]!=null) {
								  return false;
							  }
						  }
						  return true;
					}else if(yYuan>y) {//向上走
						  for(int i = y+1;i<yYuan;i++) {
							  if(ChessPanel.allChess[i][x]!=null) {
								  return false;
							  }
						  }
						  return true;
					}
				}
				//横着走
				if(yYuan==y) {
					
					if(xYuan<x) {//向右走
						  for(int i = xYuan+1;i<x;i++) {
							  if(ChessPanel.allChess[y][i]!=null) {
								  return false;
							  }
						  }
						  return true;
					}else if(xYuan>x) {//向左走
						  for(int i = x+1;i<xYuan;i++) {
							  if(ChessPanel.allChess[y][i]!=null) {
								  return false;
							  }
						  }
						  return true;
					}
				}
				
				return false;
	}

}
