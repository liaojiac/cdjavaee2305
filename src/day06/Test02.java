package day06;

public class Test02 {
	public static void main(String[] args) {
		Test01 s = new Test01();
		boolean flag =s.isTriangle(3,2,3);
		if(flag) {
			System.out.println("是三角形");
		}else System.out.println("不是三角形");
	}
}
