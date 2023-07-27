package day22.test;

public class GF implements Runnable{
	Account account;
	
	public GF(Account account) {
		this.account = account;
	}

	public void run() {
		for(int i=1;i<=10;i++) {
			synchronized (account) {
				while(account.money<1000) {
					System.out.println(Thread.currentThread().getName()+"发现账户没有钱，等等再取");
					try {
						account.wait();
					} catch (InterruptedException e) {
					
						e.printStackTrace();
					}
				}
				account.withDraw();
				System.out.println(Thread.currentThread().getName()+"第"+i+"次取出1000");
				account.notify();
			}
			
		}
	}
}
