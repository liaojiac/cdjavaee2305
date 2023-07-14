package day14.binarytest;

import java.util.Scanner;

public class Test {
private void main() {
	Scanner input =new Scanner(System.in);
	System.out.println("请输入");
    int decimal = input.nextInt();
    Decimalto r =new Decimalto();
    String str =r.toBinary(decimal);
}
}
