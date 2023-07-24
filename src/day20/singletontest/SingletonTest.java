package day20.singletontest;

public class SingletonTest {
	private static  SingletonTest duixiang;
	private SingletonTest(){
	}
	public static SingletonTest getDuixiang() {
		if(duixiang==null) {//第一次检查，如果不为空那么就不需要进入获取锁的步骤，提高了效率
			synchronized (SingletonTest.class) {
				if(duixiang==null) {//第二次检查是因为可能有多个线程通过了第一次检查
					//如果不进行二次判断就会有多个线程创建对象
					return duixiang=new SingletonTest();
				}
			}
		}
		return duixiang;
	}

	
}
