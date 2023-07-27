package day21.work;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExample {
    public static void main(String[] args) {
        // 创建线程池
       ThreadPoolExecutor tpe = new ThreadPoolExecutor(6, 10, 60, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(1000));
       ThreadLocal<SimpleDateFormat> threadLocal = new ThreadLocal<SimpleDateFormat>() {
    	   protected SimpleDateFormat initialValue(){
			return new SimpleDateFormat("HH:mm:ss");
    		   
    	   }
       };

        // 提交任务
        for (int i = 0; i < 1000; i++) {
        	int temp = i;
        	Runnable task =new Runnable() {
        		
        		public void run() {
        		
        			String time ="" ;
        			SimpleDateFormat sdf =threadLocal.get();
        			time = sdf.format(new Date(temp*1000));
        			System.out.println(Thread.currentThread().getName()+"---"+time);
        		}
        	};
            tpe.execute(task);
        }

        // 关闭线程池
        tpe.shutdown();
    }
}