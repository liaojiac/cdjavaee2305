package chinese_chess.util;

import java.io.IOException;
import java.io.InputStream;
import sun.audio.*;
public class AudioUtil {
	public static void play(String path) {
		InputStream is = AudioUtil.class.getClassLoader().getResourceAsStream(path);
		try {
			AudioStream as = new AudioStream (is);
			AudioPlayer.player.start(as);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
//	public static void main(String[] args) {
//		play("sounds/select.wav");
//	}
}
