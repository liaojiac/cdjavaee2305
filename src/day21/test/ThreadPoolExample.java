package day21.test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExample {
    public static void main(String[] args) {
        // 创建线程池
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                15, // 核心线程数
                20, // 最大线程数
                0L, // 闲置线程存活时间
                TimeUnit.MILLISECONDS, // 闲置线程存活时间单位
                new LinkedBlockingQueue<>() // 任务队列
        );

        // 定义任务类
        class TimeFormatter implements Runnable {
            @Override
            public void run() {
                // 时间格式化逻辑，每个任务获取当前时间进行格式化输出
                Date now = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String formattedTime = sdf.format(now);
                System.out.println(Thread.currentThread().getName() + ": " + formattedTime);
            }
        }

        // 提交任务
        for (int i = 0; i < 1000; i++) {
            executor.execute(new TimeFormatter());
        }

        // 关闭线程池
        executor.shutdown();
    }
}
