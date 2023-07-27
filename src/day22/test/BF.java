package day22.test;

public class BF implements Runnable{
	Account account;
	@Override
	
	public void run() {
		for(int i=1;i<=10;i++) {
			synchronized (account) {
				while(account.money>=1000) {
					System.out.println(Thread.currentThread().getName()+"发现账户有钱，等等再存");
					try {
						account.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				account.save();
				System.out.println(Thread.currentThread().getName()+"第"+i+"次存入1000");
				account.notify();
			}
			
		}
	}
	public BF(Account account) {
		this.account = account;
	}

}
