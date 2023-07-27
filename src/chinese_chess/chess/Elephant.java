package chinese_chess.chess;

import java.awt.Point;

public class Elephant extends Chess{

	public Elephant(Point point, Camp camp, Type type) {
		super(point, camp, type);
	}

	@Override
	public boolean move(int x, int y) {
		return false;
	}

}
