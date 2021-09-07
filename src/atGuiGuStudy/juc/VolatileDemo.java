package atGuiGuStudy.juc;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/8/17 10:15 上午
 */

class MyData {
    //    int number = 0;
    volatile int number = 0;

    public void addTo50() {
        this.number = 60;
    }

    //    public synchronized void addPlusPlus() {}
    public void addPlusPlus() {
        this.number++;
    }

    AtomicInteger atomicInteger = new AtomicInteger();
    public void addAtomic(){
        atomicInteger.getAndIncrement();
    }
}

/**
 * 1.验证volatile保证可见性
 *  1.1 如果number前没有volatile修饰，则没有可见性
 *  1.2 添加了volatile，可以解决可见性问题
 * 2.验证volatile不保证原子性
 *  2.1 原子性指一组操作要么都成功，要么都失败，不可分割。
 *  2.2 为什么不保证原子性？操作中被加塞。
 *  2.3 如何解决原子性？
 *      * 加synchronized关键字
 *      * 使用JUC下的AtomicInteger
 */
public class VolatileDemo {
    public static void main(String[] args) {
        MyData myData = new MyData();
        for (int i = 1; i <= 20; i++) {
            new Thread(() -> {
                for (int j = 1; j <= 1000; j++) {
                    // 不保证原子性
                    myData.addPlusPlus();
                    // 保证原子性
                    myData.addAtomic();
                }
            }, String.valueOf(i)).start();
        }

        // 等待上面20个线程全部执行完毕，再用main线程查看最终的结果
        while (Thread.activeCount() > 2) {
            Thread.yield();
        }
        System.out.println(Thread.currentThread().getName() + "\t finally number value: " + myData.number);
        System.out.println(Thread.currentThread().getName() + "\t finally atomicInteger value: " + myData.atomicInteger);

        int a = 1;
        int b = 2;
        System.out.println(b);
    }

    public static void seekOKByVolatile() {
        MyData myData = new MyData();

        // 实现了Runnable接口的lambda表达式
        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "\t come in");
            // 暂停一下线程，让别的线程读取变量
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            myData.addTo50();
            System.out.println(Thread.currentThread().getName() + "\t updated number value: " + myData.number);
        }, "AAA").start();

        // 第二个线程就是main线程
        while (myData.number == 0) {
            // main线程一直等待循环，直到number不再等于0
        }
        System.out.println(Thread.currentThread().getName() + "\t thread is over");
    }
}
