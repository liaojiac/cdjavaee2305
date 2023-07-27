package day23.test;

import java.io.FileInputStream;

public class TestStream {
public static void main(String[] args) throws Exception {
	FileInputStream fis = new FileInputStream("E:/新建文本文档.txt");
	int data;
	while((data=fis.read())!=-1){
		System.out.println(data);
	}
}
}
