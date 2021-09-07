package atGuiGuStudy.juc;

import java.util.concurrent.*;

class MyThread01 extends Thread {
    @Override
    public void run() {

    }
}

class MyThread02 implements Runnable {
    @Override
    public void run() {

    }
}

class MyThread implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        System.out.println(Thread.currentThread().getName() + "\t***********come in");
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return 1024;
    }
}

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/8/20 4:53 下午
 */
public class CallableDemo {
    public static void main(String[] args) throws Exception {
        FutureTask<Integer> futureTask = new FutureTask<>(new MyThread());
        new Thread(futureTask, "t1").start();
        // 如果只有一个futureTask，那么就算有两个线程，call()方法也只会执行一次
//        new Thread(futureTask, "t2").start();

//        int result02 = futureTask.get();
        System.out.println(Thread.currentThread().getName() + "\t**********");
        int result01 = 100; 

//        futureTask计算结束后，再继续main线程
//        while (!futureTask.isDone()) {
//
//        }

        // futureTask.get()：获取Callable线程的计算结果。
        // 建议放在最后。如果没有计算完成，就回去等待，造成堵塞，直到计算完成
        int result02 = futureTask.get();
        System.out.println("********result: " + (result01 + result02));
    }
}
