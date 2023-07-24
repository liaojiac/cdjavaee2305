package day20.locktest;

public class DeathLock implements Runnable{
	Integer a;
	Integer b;
	
	public DeathLock(Integer a, Integer b) {
		this.a = a;
		this.b = b;
	}
	public void run() {
		synchronized (a) {
			System.out.println(Thread.currentThread().getName()+"获取到了"+a);
			synchronized (b) {
				System.out.println(Thread.currentThread().getName()+"获取到了"+b);
				System.out.println(a+b);
			}
		}
	}

}
