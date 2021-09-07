package atGuiGuStudy.juc;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/8/17 5:42 下午
 */

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 1 CAS是什么？ ==>compareAndSet
 * 比较并交换
 */
public class CASDemo {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(5);
        System.out.println(atomicInteger.compareAndSet(5, 2021) + "\t current data: " + atomicInteger.get());
    }
}
