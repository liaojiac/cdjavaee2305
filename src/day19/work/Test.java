package day19.work;

public class Test {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
	int thcount=5;
	MyThread[] threads = new MyThread[thcount];
	for (int i = 0; i < threads.length; i++) {
		int startIndex =i*thcount;
		int endIndex =(i==threads.length-1)?threads.length-1:(i+1)*thcount;
		threads[i]=new MyThread(arr,startIndex,endIndex);
		threads[i].start();
	}
	for (int i = 0; i < thcount; i++) {
        try {
            threads[i].join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
	 int sum = 0;
     for (int i = 0; i < thcount; i++) {
         sum += threads[i].getResult();
         System.out.println(threads[i].getResult());
     }

     System.out.println("计算结果：" + sum);
}
}
