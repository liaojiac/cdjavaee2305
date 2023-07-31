package chinese_chess.chess;

import java.awt.Point;

import chinese_chess.biz.ChessPanel;
import chinese_chess.util.Constant;

public class Horse extends Chess {

	public Horse(Point point, Camp camp, Type type) {
		super(point, camp, type);
	}

	@Override
	// 马走日
	public boolean move(int x, int y) {
		// 获取到当前点位
		int xYuan = (getPoint().x - Constant.INITX) / Constant.CHESS_SIZE;
		int yYuan = (getPoint().y - Constant.INITY) / Constant.CHESS_SIZE;
		// 通过循环来判断原来的坐标到目标点位坐标有多少棋子

		// 往左走
		if (x == xYuan - 2 && (y == yYuan - 1 || y == yYuan + 1)) {
			if (ChessPanel.allChess[yYuan][xYuan - 1] == null) {
				return true;
			}
		}

		// 往右
		if (x == xYuan + 2 && (y == yYuan - 1 || y == yYuan + 1)) {
			if (ChessPanel.allChess[yYuan][xYuan + 1] == null) {
				return true;
			}
		}

		// 往上
		if (y == yYuan - 2 && (x == xYuan - 1 || x == xYuan + 1)) {
			if (ChessPanel.allChess[yYuan - 1][xYuan] == null) {
				return true;
			}
		}
		// 往下
		if (y == yYuan + 2 && (x == xYuan - 1 || x == xYuan + 1)) {
			if (ChessPanel.allChess[yYuan + 1][xYuan] == null) {
				return true;
			}
		}

		return false;
	}

}
