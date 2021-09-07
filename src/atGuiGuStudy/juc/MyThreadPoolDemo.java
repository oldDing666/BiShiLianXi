package atGuiGuStudy.juc;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/8/21 9:54 上午
 */
public class MyThreadPoolDemo {
    public static void main(String[] args) {
//        threadPoolInit();


    }

    public static void threadPoolInit() {
        // 一池5个处理线程
//        ExecutorService threadPool = Executors.newFixedThreadPool(5);
        // 一池1个处理线程
//        ExecutorService threadPool = Executors.newSingleThreadExecutor();
        // 一池n个处理线程
        ExecutorService threadPool = Executors.newCachedThreadPool();
        try {
            for (int i = 1; i <= 10; i++) {
                threadPool.execute(() -> {
                    System.out.println(Thread.currentThread().getName() + "\t is running");
                });
//                try {
//                    TimeUnit.SECONDS.sleep(1);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            threadPool.shutdown();
        }
    }
}