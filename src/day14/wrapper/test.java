package day14.wrapper;

public class test {
public static void main(String[] args) {
	Integer x = Integer.valueOf(3);
	Integer y = 3;
	Integer a = 300;
	Integer b = 300;
	
	int c = x.intValue() + 3;
	Integer d =new Integer(3);
	System.out.println(x==y);
	System.out.println(a==b);
	System.out.println(Integer.toBinaryString(2147483647));
}
}
