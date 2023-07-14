package day13.Innerclass;

public class Member {
	int num =8;
	 class Yours{
		int num = 7;
		public void method() {
			int num =6;
			System.out.println(this.num);//调用内部类的num
			System.out.println(Member.this.num);
		}
	}
}
