package day19.exceptiontest;

public class ThreadTest {
public static void main(String[] args) {
	
	/*MyThread m1 = new MyThread();
	m1.setName("wo1");
	MyThread m2 = new MyThread();
	m2.setName("wo2");
	MyThread m3= new MyThread();
	m1.start();
	m2.start();
	m3.start();*/
	MyThreadTest01 mr = new MyThreadTest01();
	Thread mm1 =new Thread(mr,"窗口01");
	Thread mm2 =new Thread(mr,"窗口02");
	Thread mm3 =new Thread(mr,"窗口03");
	mm1.start();
	mm2.start();
	mm3.start();
}
}
