package chinese_chess.chess;

import java.awt.Point;

import chinese_chess.biz.ChessPanel;
import chinese_chess.util.Constant;

public class Guard extends Chess{

	public Guard(Point point, Camp camp, Type type) {
		super(point, camp, type);
	}

	@Override
	//士走斜边
	public boolean move(int x, int y) {
		// 获取到当前点位
		int xYuan = (getPoint().x - Constant.INITX) / Constant.CHESS_SIZE;
		int yYuan = (getPoint().y - Constant.INITY) / Constant.CHESS_SIZE;
		//红士或者黑做验证
		if(getCamp()==Camp.红方) {
			if(x>=3&&x<=5&&y<=2) {
				if(x==xYuan-1&&y==yYuan-1||x==xYuan-1&&y==yYuan+1||x==xYuan+1&&y==yYuan+1||x==xYuan+1&&y==yYuan-1) {
					return true;
				}
			}
		}
		if(getCamp()==Camp.黑方) {
			if(x>=3&&x<=5&&y>=7) {
				if(x==xYuan-1&&y==yYuan-1||x==xYuan-1&&y==yYuan+1||x==xYuan+1&&y==yYuan+1||x==xYuan+1&&y==yYuan-1) {
					return true;
				}
			}
		}
		return false;
	}

}
