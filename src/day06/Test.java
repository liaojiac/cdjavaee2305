package day06;

public class Test {
	public static void main(String[] args) {
		//method(3.4);
	int x= method();
	if (x>20) {
		System.out.println("你获奖了");
	}else {
		System.out.println("大慈善家");
	}
}
	/*public static void method(double a) {
		double s=0;
		if(a-(int)a>=0.5) {
			s=(int)a+1;
		}else {
			s=(int)a/1;
		}
		System.out.println(s);
	}*/
	public static int method() {
		int sum=0;
		int num=0;
		int a = (int)(Math.random()*(10000-1000)+1000);
		System.out.println(a);
		while(a!=0) {
			num =a%10;
			sum +=num;
			a=a/10;
		}
		return sum;
		
	}
}
