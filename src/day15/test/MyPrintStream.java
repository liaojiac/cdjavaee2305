package day15.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class MyPrintStream {
public static void main(String[] args) throws FileNotFoundException {
	int a=1;
	int b =2;
	method(1,2);
	System.err.println(a);
	System.out.println(b);
}

private static void method(int i, int j) throws FileNotFoundException {
    System.setOut(new PrintStream(System.out) {
        @Override
        public void println(int x) {//重写println方法
            super.println(x * 100);
        }
    });
}
	
	
}
