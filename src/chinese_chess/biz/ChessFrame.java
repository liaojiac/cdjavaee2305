package chinese_chess.biz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import chinese_chess.util.Constant;

/**
 * 这是象棋的界面，前端，展示棋盘棋子
 * @author liaojiachao
 *
 */
public class ChessFrame extends JFrame{
	MusicThread mt =null;
//初始化界面的方法
	public void init() {//把入口转移到这
		this.setTitle(Constant.TITLE);//设置标题
		this.setLocationRelativeTo(null);
		this.setResizable(false);//不能拖动窗口改变大小
		//添加一个菜单项
		JMenuBar bar = new JMenuBar();
		JMenu menu= new JMenu("背景音乐");
		JMenuItem item1 = new JMenuItem("播放");
		item1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//使用线程播放音乐
				if(mt ==null) {
					mt = new MusicThread();
					mt.start();
				}
			}
		});
		JMenuItem item2 = new JMenuItem("暂停");
		item2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 暂停音乐
				if(mt!=null) {
					mt.stopBG();
					mt=null;
				}
			}
		});
		//菜单添加到界面上
		menu.add(item1);
		menu.add(item2);
		bar.add(menu);
		this.setJMenuBar(bar);
		ChessPanel panel =new ChessPanel();
		this.add(panel);//把桌布添加到桌子上
		panel.requestFocus(); ;//默认让桌布响应点击
		this.setSize(Constant.WIDTH,Constant.HEIGHT);//设置高宽
		this.setVisible(true);//设计界面的可见性
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);//设置关闭就退出程序
		
		panel.start();//把主动权给panel
	}

}
