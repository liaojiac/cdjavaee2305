 package day22.test;

import java.io.File;

public class TestFind {
public static void main(String[] args) {
	String path = "e:/";
	getFiles(path);
	
}

private static void getFiles(String path) {
	File dir = new File(path);
	File[] files =dir.listFiles();
	for ( File f: files) {
		if(f.isFile()) {
			System.out.println(f.getName());
		}else {
			getFiles(f.getAbsolutePath());
			System.out.println(f.getAbsolutePath());
		}
	}
}
}
