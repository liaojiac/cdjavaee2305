package day22.test;

public class Mytest {
	public static void main(String[] args) {
		Account account= new Account();
		Thread bf = new Thread(new BF(account),"舔狗");
		Thread gf = new Thread(new GF(account),"海王");
		bf.start();
		gf.start();
	}
}
