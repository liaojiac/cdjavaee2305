package day19.exceptiontest;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcpetionTest {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	try {
		System.out.println("请输入被除数");
		int i = input.nextInt();
		System.out.println("请输入除数");
		int j =input.nextInt();
		System.out.println(i/j);
	} catch (InputMismatchException e) {	
		throw new RuntimeException("错误");
	}catch(ArithmeticException e) {
		System.out.println("除数不能为0");
	}catch(Exception e) {
		System.out.println("未知");
	}
}
}
