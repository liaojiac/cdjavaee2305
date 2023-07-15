package day14.binarytest;

import java.util.Iterator;

public class Decimalto {
	StringBuffer binary = new StringBuffer();
	public String toBinary(int decimal) {
		while(decimal>0) {//通过位运算完成10转2进制
			int bit =decimal&1;
			binary.insert(0, bit);
			decimal = decimal>>1;
		}
		return binary.toString();
		
	}
	public int bTod(String str) {
		int sum =0;
		int power =1;
		for (int i = str.length()-1; i>=0; i--) {
			int x = str.charAt(i)-'0';
			sum+=x*power;
			power *=2;
		}
		return sum;
		
	}
}

