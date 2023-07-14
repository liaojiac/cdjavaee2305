package day13.nona;

public class Test {
	
	public static void main(String[] args) {	
		//如果我们希望这个类只在main方法用
//		class Sub extends Sup {
//
//		}
		
		//Sup sup = new Sub();//sub是一个外部类
		//Sup sup1 = new Sub();
		
		/*Sup sup = new Sup() {//Test$1
			public void test() {
				System.out.println("inner");
			}
		};
		sup.test();
		System.out.println(sup);*/
		
		User user = new User() {
			public void test() {
				System.out.println("noname-user");
			}
		};
		user.test();
		System.out.println(user);

	}
	
	

}
