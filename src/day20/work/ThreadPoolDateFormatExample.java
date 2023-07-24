package day20.work;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDateFormatExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(10);
        for (int i = 1; i <= 1000; i++) {
            final int threadNumber = i;
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
                    String formattedDate = simpleDateFormat.format(new Date());
                    System.out.println("Thread-" + threadNumber + ": " + formattedDate);
                }
            });
        }
        executor.shutdown();
    }
}