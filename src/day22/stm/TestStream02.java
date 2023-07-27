package day22.stm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestStream02 {
	public static void main(String[] args) throws IOException {
		File dir = new File("E:\\新建文件夹\\Test01");
		dir.mkdir();
		File file = new File(dir, "test.txt");
		System.out.println(file.createNewFile());
		FileOutputStream fis=new FileOutputStream(file);
		String str = "sasf";
		byte[] by=str.getBytes();
		fis.write(1);
	}
}
