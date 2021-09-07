package atGuiGuStudy.jvm;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/8/27 11:36 上午
 */
public class ReferenceQueueDemo {
    public static void main(String[] args) throws InterruptedException {
        Object object = new Object();
        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
        WeakReference<Object> weakReference = new WeakReference<>(object, referenceQueue);
        System.out.println(object);
        System.out.println(weakReference.get());
        // null，队列为空
        System.out.println(referenceQueue.poll());

        System.out.println("=======================");
        object = null;
        System.gc();
        Thread.sleep(1000);
        System.out.println(object);
        System.out.println(weakReference.get());
        // 队列不为空。软引用、弱引用、虚引用在被GC回收前，会放入引用队列中。
        System.out.println(referenceQueue.poll());
    }
}
