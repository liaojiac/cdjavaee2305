package day14.binarytest;
import java.util.Scanner;
public class DecimalToBinary {
    public static void main(String[] args) {
    	Scanner input =new Scanner(System.in);
    	System.out.println("请输入");
        int decimal = input.nextInt();
        String binary = decimalToBinary(decimal);
        System.out.println(binary);
    }
    
    public static String decimalToBinary(int decimal) {
        StringBuilder binary = new StringBuilder();
        while (decimal > 0) {
            int remainder = decimal % 2;
            binary.insert(0, remainder);//0表示从字符的开头插入remainder
            decimal /= 2;
        }
        return binary.toString();
    }
}