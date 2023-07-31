package chinese_chess.biz;

import java.io.InputStream;

import chinese_chess.util.Constant;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class MusicThread extends Thread{
	Player player=null;
	public void run() {
		//先要读入音乐流
		InputStream is = MusicThread.class.getClassLoader().getResourceAsStream(Constant.BG_MUSIC);
		try {
			if(player==null) {
				player =new Player(is);	
				do {
					player.play();//循环播放
				} while (player.isComplete());
			}
		} catch (JavaLayerException e) {
			e.printStackTrace();
		}
	}
	public void stopBG() {
		if(player!=null) {
			player.close();//关闭音乐
		}
	}
}
