package day23.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TestInputStreamReader {//转换流
	public static void main(String[] args) throws Exception {
		InputStreamReader isr = new InputStreamReader(new FileInputStream("e:/新建文本文档.txt"),"UTF-8");//
		//OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("e:/新建.txt"));
		//char[] buf=new char[10];
		int data;
		while((data=isr.read())!=-1) {
			//System.out.println(new String(buf,0,data));
			System.out.println(data);
			//osw.write("我测你的马");
			//osw.flush();
		}
	}
}
