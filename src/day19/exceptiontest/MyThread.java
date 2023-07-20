package day19.exceptiontest;

public class MyThread extends Thread{
public void run() {
	
	for(int i =1;i<=100;i++) {
		
		System.out.println(Thread.currentThread().getName()+"-----"+i);
	}
}
}
