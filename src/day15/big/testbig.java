package day15.big;

import java.math.BigInteger;

public class testbig {
	public static void main(String[] args) {
		BigInteger bi =new BigInteger("789456123789446559456256232");
		bi=bi.add(bi);
		System.out.println(bi);
	}
}
