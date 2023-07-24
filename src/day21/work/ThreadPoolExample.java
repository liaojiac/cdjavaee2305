package day21.work;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {
    public static void main(String[] args) {
        // 创建线程池
        ExecutorService executorService = Executors.newFixedThreadPool(6);

        // 定义任务类
        class TimeFormatter implements Runnable {
            @Override
            public void run() {
                // 时间格式化逻辑
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String formattedTime = sdf.format(new Date());
                System.out.println(formattedTime);
            }
        }

        // 提交任务
        for (int i = 0; i < 1000; i++) {
            executorService.execute(new TimeFormatter());
        }

        // 关闭线程池
        executorService.shutdown();
    }
}