package day20.locktest;

public class Test {
public static void main(String[] args) {
	Integer a =1;
	Integer b = 1;
	 DeathLock dk1 = new DeathLock(1, 2);
	  DeathLock dk2 = new DeathLock(2, 1);
	  Thread t1 = new Thread(dk1);
	  Thread t2 = new Thread(dk2);
	  t1.start();
	  t2.start();
	  System.out.println(a==b);
	  }
}

