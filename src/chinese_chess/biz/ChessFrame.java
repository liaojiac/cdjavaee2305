package chinese_chess.biz;

import javax.swing.JFrame;

import chinese_chess.util.Constant;

/**
 * 这是象棋的界面，前端，展示棋盘棋子
 * @author liaojiachao
 *
 */
public class ChessFrame extends JFrame{
//初始化界面的方法
	public void init() {//把入口转移到这
		this.setTitle(Constant.TITLE);//设置标题
		this.setLocationRelativeTo(null);
		this.setResizable(false);//不能拖动窗口改变大小
		ChessPanel panel =new ChessPanel();
		this.add(panel);//把桌布添加到桌子上
		panel.requestFocus(); ;//默认让桌布响应点击
		this.setSize(Constant.WIDTH,Constant.HEIGHT);//设置高宽
		this.setVisible(true);//设计界面的可见性
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);//设置关闭就退出程序
		
		panel.start();//把主动权给panel
	}

}
