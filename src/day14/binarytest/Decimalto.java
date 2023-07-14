package day14.binarytest;

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
}
