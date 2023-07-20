package day19.exceptiontest;

public class MyThreadTest01 implements Runnable {
	int num = 1000;

	public void run() {
		while (num > 0) {
			synchronized (this) {
				if (num > 0) {
					System.out.println(Thread.currentThread().getName() + "正在销售第" + num-- + "张票");
				}
			}

		}
		System.out.println(Thread.currentThread().getName() + "已经售罄");
	}

}
