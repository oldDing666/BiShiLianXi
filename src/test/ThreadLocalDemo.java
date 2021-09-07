package test;

import java.util.Random;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/5/13 3:09 下午
 */
public class ThreadLocalDemo implements Runnable {
    private static final ThreadLocal<Integer> value = new ThreadLocal<>();

    public static void main(String[] args) throws InterruptedException {
        ThreadLocalDemo obj = new ThreadLocalDemo();
        for (int i = 0; i < 5; i++) {
            Thread t = new Thread(obj, "" + i);
            Thread.sleep(new Random().nextInt(1000));
            t.start();
        }
    }

    @Override
    public void run() {
        System.out.println("Thread Name = " + Thread.currentThread().getName() +
                " default value = " + value.get());
        try {
            Thread.sleep(new Random().nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        value.set(10);
        System.out.println("Thread Name = " + Thread.currentThread().getName() +
                " current value = " + value.get());
    }
}
