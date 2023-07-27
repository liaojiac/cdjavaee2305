package day22.stm;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestStream {
	public static void main(String[] args) throws FileNotFoundException  {
		FileInputStream fis = new FileInputStream("E:\\新建文本文档.txt");
		//FileOutputStream fos = new FileOutputStream("D:\\Program Files\\feiq\\Recv Files\\20230725-day22-线程4\\新建文本文档.mp4");
		byte[] buf = new byte[3];
		int length;
		try {
			while((length=fis.read(buf))!=-1) {
				System.out.println(new String(buf,0,length));
				//fos.write(buf, 0, length);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
