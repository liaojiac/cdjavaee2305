package day24.test;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.*;
public class Download {
public static void main(String[] args) throws Exception {
	String url = "https://www.bilibili.com/video/BV1ZV411L7Xn/?spm_id_from=333.1007.tianma.1-3-3.click&vd_source=dd84cce99f94037c2f5a106ee4a71ef3";
	URL res = new URL(url);
	URLConnection conn= res.openConnection();
	InputStream is = conn.getInputStream();
	OutputStream fi = new FileOutputStream("e:/aaa.mpeg4");
	int length;
	byte[] buf = new byte[1024*1024];
	while((length=is.read(buf))!=-1) {
		fi.write(buf, 0, length);
		fi.flush();
	}
	fi.close();
	is.close();
}
}
