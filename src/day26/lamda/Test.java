package day26.lamda;

public class Test {
public static void main(String[] args) {
//	User u = (x,y)->x+y;
//	System.out.println(u.test(10, 3.1415926));
	User u = System.out::println;
	u.test(6);
}
}
