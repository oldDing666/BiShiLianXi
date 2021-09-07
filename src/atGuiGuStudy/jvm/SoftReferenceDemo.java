package atGuiGuStudy.jvm;

import java.lang.ref.SoftReference;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/8/27 10:14 上午
 */
public class SoftReferenceDemo {

    /**
     * 内存够用就保留，不够用就回收
     */
    public static void softRef_Memory_Enough() {
        Object object1 = new Object();
        SoftReference<Object> softReference = new SoftReference<>(object1);
        System.out.println(object1);
        // 打印与object1相同的地址
        System.out.println(softReference.get());
        // 使强引用不再指向该对象
        object1 = null;
        System.gc();
        System.out.println(object1);
        //仍然能打出地址
        System.out.println(softReference.get());
    }

    /**
     * JVM配置，故意产生大对象并配置小的内存，
     * 让它的内存不够，导致OOM，看软引用的回收情况
     * -Xms5m -Xmx5m -XX:+PrintGCDetails
     */
    public static void softRef_Memory_NotEnough() {
        Object object1 = new Object();
        SoftReference<Object> softReference = new SoftReference<>(object1);
        System.out.println(object1);
        // 打印与object1相同的地址
        System.out.println(softReference.get());
        // 使强引用不再指向该对象
        object1 = null;
        try {
            // 对象占用30M的堆空间，使堆中内存不足
            byte[] bytes = new byte[30 * 1024 * 1024];
        } catch (Throwable e) {
            e.printStackTrace();
        } finally {
            System.out.println(object1);
            // 内存不足，softReference指向的对象被回收，打印null
            System.out.println(softReference.get());
        }
    }

    public static void main(String[] args) {
//        softRef_Memory_Enough();
        softRef_Memory_NotEnough();
    }
}
