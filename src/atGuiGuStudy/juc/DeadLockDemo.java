package atGuiGuStudy.juc;

import java.util.concurrent.TimeUnit;

class HoldLockThread implements Runnable {
    private String lockA;
    private String lockB;

    public HoldLockThread(String lockA, String lockB) {
        this.lockA = lockA;
        this.lockB = lockB;
    }

    @Override
    public void run() {
        synchronized (lockA) {
            System.out.println(Thread.currentThread().getName() + "\t 自己持有" + lockA + "\t 尝试获得" + lockB);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (lockB) {
                System.out.println(Thread.currentThread().getName() + "\t 自己持有" + lockB + "\t 尝试获得" + lockA);
            }
        }

    }
}

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/8/25 4:41 下午
 */
public class DeadLockDemo {
    public static void main(String[] args) {
        String lockA = "lockA";
        String lockB = "lockB";
        new Thread(new HoldLockThread(lockA,lockB),"AAA").start();
//        new Thread(new HoldLockThread(lockB,lockA),"new Thread name").start();
        // 按序申请锁，打破死锁
        new Thread(new HoldLockThread(lockA,lockB),"BBB").start();
    }
}
