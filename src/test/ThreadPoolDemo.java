package test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/5/14 9:07 上午
 */
public class ThreadPoolDemo {
    // 核心线程数为5
    private static final int CORE_POOL_SIZE = 5;
    // 最大线程数为10
    private static final int MAX_POOL_SIZE = 10;
    // 任务队列容量为100
    private static final int QUEUE_CAPACITY = 100;
    // 等待时间为1L
    private static final long KEEP_ALIVE_TIME = 1L;
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                CORE_POOL_SIZE,
                MAX_POOL_SIZE,
                KEEP_ALIVE_TIME,
                // 等待时间的单位为秒
                TimeUnit.SECONDS,
                // 任务队列容量为100
                new ArrayBlockingQueue<>(QUEUE_CAPACITY),
                // 饱和策略为CallerRunsPolicy
                new ThreadPoolExecutor.CallerRunsPolicy()
        );
        for (int i = 0; i < 10; i++) {
            // 创建线程对象
            Runnable worker = new MyRunnable("" + i);
            // 添加到线程池，执行线程
            executor.execute(worker);
        }
        // 终止线程池
        executor.shutdown();
        while (!executor.isTerminated()) {
        }
        System.out.println("Finish all threads");
    }
}
