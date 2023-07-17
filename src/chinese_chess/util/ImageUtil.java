package chinese_chess.util;

import java.awt.Image;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

/**
 * 这个类的作用是把一个图片文件转为图片对象
 * @author hasee
 *
 */
public class ImageUtil {
	public static Image getImage(String path) {
		Image img =null;
		//获取文件路径
		URL url=ImageUtil.class.getClassLoader().getResource(path);
		try {//读取文件转为图片
			img=ImageIO.read(url);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return img;
	}
	/*public static void main(String[] args) {
		Image image = getImage("images/bg.jpg");
		System.out.println(image);
	}*/
}
