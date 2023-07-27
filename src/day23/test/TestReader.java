package day23.test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestReader {
public static void main(String[] args) throws IOException {
	FileReader rd = new FileReader("E:\\新建文本文档.txt");
	FileWriter fw= new FileWriter("E:\\d.txt");
	char [] buf = new char[10];
	int length;
	while((length=rd.read(buf))!=-1) {
		System.out.println(new String(buf,0,length));
		fw.write(buf,0,length);
	}
	fw.close();
	rd.close();
}
}
