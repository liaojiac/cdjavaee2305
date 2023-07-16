package chinese_chess.biz;

import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * 这个是桌布类，棋子棋盘都在这里绘制
 * @author liaojiachao
 *
 */
public class ChessPanel extends JPanel{
	
	//绘制图案
	@Override
	public void paint(Graphics g) {
		g.drawImage(null, ALLBITS, ABORT, getFocusCycleRootAncestor());
		
	}
	public void start() {
		
		
	}



}
