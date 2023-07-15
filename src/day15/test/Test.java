package day15.test;

import java.util.Random;

public class Test {
	 static MethodTest m;
public static void main(String[] args) {
	Runtime rt =Runtime.getRuntime();
/*System.out.println(rt.availableProcessors());
System.out.println(rt.freeMemory());
System.out.println(rt.totalMemory());
System.out.println(rt.maxMemory());
int[] num =new int[710000000];
System.out.println("-----------------");
System.out.println(rt.freeMemory());
System.out.println(rt.totalMemory());
System.out.println(rt.maxMemory());*/
 int sui = new Random().nextInt(99);
 System.out.println(sui);
 System.out.println(sui);
 //Test.m.method();//会报空指针异常，因为m没有初始化
	}
}
