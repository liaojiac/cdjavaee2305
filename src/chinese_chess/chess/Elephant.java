package chinese_chess.chess;

import java.awt.Point;

import chinese_chess.biz.ChessPanel;
import chinese_chess.util.Constant;

public class Elephant extends Chess{

	public Elephant(Point point, Camp camp, Type type) {
		super(point, camp, type);
	}

	@Override
	//象飞田
	public boolean move(int x, int y) {
		// 获取到当前点位
		int xYuan = (getPoint().x - Constant.INITX) / Constant.CHESS_SIZE;
		int yYuan = (getPoint().y - Constant.INITY) / Constant.CHESS_SIZE;
		//红象或者黑象做一会无效验证
		if(getCamp()==Camp.红方&&y>=5||getCamp()==Camp.黑方&&y<=4) {
			return false;
		}

		// 往左上走
		if (x == xYuan - 2 && y == yYuan - 2) {
			if (ChessPanel.allChess[yYuan-1][xYuan - 1] == null) {
				return true;
			}
		}
		// 往左下走
				if (x == xYuan - 2 && y == yYuan + 2) {
					if (ChessPanel.allChess[yYuan+1][xYuan - 1] == null) {
						return true;
					}
				}
				// 往右上走
				if (x == xYuan + 2 && y == yYuan - 2) {
					if (ChessPanel.allChess[yYuan-1][xYuan + 1] == null) {
						return true;
					}
				}
				// 往右下走
						if (x == xYuan + 2 && y == yYuan + 2) {
							if (ChessPanel.allChess[yYuan+1][xYuan + 1] == null) {
								return true;
							}
						}
		return false;
	}

}
