package atGuiGuStudy.juc;

import java.util.concurrent.CountDownLatch;

/**
 * CountDownLatch：让一些线程阻塞，直到另一些线程完成一系列操作后，才被唤醒
 */
public class CountDownLatchDemo {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(6);
        for (int i = 1; i <= 6; i++) {
            new Thread(() -> {
                System.out.println(Thread.currentThread().getName() + "\t国，被灭");
                // 每执行完一个线程，计数器减1
                countDownLatch.countDown();
            }, CountryEnum.forEach_CountryEnum(i).getRetMessage()).start();
        }
        // 等待countDownLatch的计数器变为0，再执行main线程
        countDownLatch.await();
        System.out.println(Thread.currentThread().getName()+"\t**************秦帝国，一统华夏");
    }
}
