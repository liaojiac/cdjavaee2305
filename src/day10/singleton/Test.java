package day10.singleton;

public class Test {
	public static void main(String[] args) {
		Student s =Student.getInstanse();
		System.out.println(s);
		Student x =Student.getInstanse();
		System.out.println(x);
	}
}
