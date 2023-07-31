package chinese_chess.chess;

import java.awt.Point;

import chinese_chess.util.Constant;

public class Boss extends Chess{

	public Boss(Point point, Camp camp, Type type) {
		super(point, camp, type);
	}

	@Override
	//王
	public boolean move(int x, int y) {
		// 获取到当前点位
		int xYuan = (getPoint().x - Constant.INITX) / Constant.CHESS_SIZE;
		int yYuan = (getPoint().y - Constant.INITY) / Constant.CHESS_SIZE;
		//红士或者黑做验证
		if(getCamp()==Camp.红方) {
			if(x>=3&&x<=5&&y<=2) {
				if(x==xYuan&&y==yYuan-1||x==xYuan-1&&y==yYuan||x==xYuan&&y==yYuan+1||x==xYuan+1&&y==yYuan) {
					return true;
				}
			}
		}
		if(getCamp()==Camp.黑方) {
			if(x>=3&&x<=5&&y>=7) {
				if(x==xYuan&&y==yYuan-1||x==xYuan-1&&y==yYuan||x==xYuan&&y==yYuan+1||x==xYuan+1&&y==yYuan) {
					return true;
				}
			}
		}
		return false;
	}

}
