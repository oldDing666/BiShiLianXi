package test;

import java.util.Date;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/5/14 9:03 上午
 */
public class MyRunnable implements Runnable {
    private String command;

    public MyRunnable(String command) {
        this.command = command;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Start.Time = " + new Date());
        // 这个线程执行5秒钟左右
        processCommand();
        System.out.println(Thread.currentThread().getName() + " End.Time = " + new Date());
    }

    private void processCommand() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return this.command;
    }
}
