package chinese_chess.chess;

import java.awt.Point;

import chinese_chess.util.Constant;

public class Soldier extends Chess {

	public Soldier(Point point, Camp camp, Type type) {
		super(point, camp, type);
	}

	@Override
	//兵向前
	public boolean move(int x, int y) {
		// 获取到当前点位
		int xYuan = (getPoint().x - Constant.INITX) / Constant.CHESS_SIZE;
		int yYuan = (getPoint().y - Constant.INITY) / Constant.CHESS_SIZE;
		//紅兵
		if(getCamp()==Camp.红方) {
			//先判断过河没有
			if(y==4) {//没过河
				if(x==xYuan&&y==yYuan+1) {
					return true;
				}
			}
			//过河了
			if(y>4) {
				if(x==xYuan&&y==yYuan+1||y==yYuan&&x==xYuan+1||y==yYuan&&x==xYuan-1) {
					return true;
				}
			}
		}
		//黑兵
		if(getCamp()==Camp.黑方) {
			//先判断过河没有
			if(y==5) {//没过河
				if(x==xYuan&&y==yYuan-1) {
					return true;
				}
			}
			//过河了
			if(y<4) {
				if(x==xYuan&&y==yYuan-1||y==yYuan&&x==xYuan+1||y==yYuan&&x==xYuan-1) {
					return true;
				}
			}
		}
		return false;
	}

}
