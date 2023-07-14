package day13.Innerclass;

public class Test {
	public static void main(String[] args) {
		My mm = new My();
		mm.method();
		int x=99;
		Noname no = new Noname() {
			void method02() {
				System.out.println(x);
			}
		};
		no.method02();
	}
}
