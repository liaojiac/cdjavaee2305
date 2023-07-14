package day13.Innerclass;

public class My {
	int num =8;
	public void method() {
		int num =7;
		class Inner{
			int num = 6;
			public void sy() {
				int num = 5;
				//无法直接输出方法method的num值，除非改名不与其他的num冲突
				System.out.println(num);//输出内部类方法里的num值
				System.out.println(this.num);//输出内部类的num值
				System.out.println(My.this.num);//输出外部类的num值
			}
			
		}
		
		new Inner().sy();
	}
}
