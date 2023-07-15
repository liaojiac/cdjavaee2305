package day14.binarytest;

import java.util.Scanner;

public class Test {
public static void main(String[] args) {
	
 {
	Scanner input =new Scanner(System.in);
	System.out.println("请输入");
    int decimal = input.nextInt();
    Decimalto r =new Decimalto();
    String str =r.toBinary(decimal);
   int s= r.bTod(str);
   System.out.println(str);
   System.out.println(s);
   
}
}}
