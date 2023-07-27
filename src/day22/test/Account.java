package day22.test;

public class Account {
	int money ;
	public void save() {
		money+=1000;
		System.out.println(Thread.currentThread().getName()+"---"+"存入1000"+"当前余额"+money);
	}
	public void withDraw() {
		money-=1000;
		System.out.println(Thread.currentThread().getName()+"---"+"取出1000"+"当前余额"+money);
	}
}
