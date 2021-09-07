package atGuiGuStudy.jvm;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/8/27 11:49 上午
 */
public class PhantomReferenceDemo {
    public static void main(String[] args)throws Exception {
        Object object = new Object();
        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
        PhantomReference<Object> phantomReference = new PhantomReference<>(object, referenceQueue);
        System.out.println(object);
        // null，虚引用不能通过get方法获取对象
        System.out.println(phantomReference.get());
        // null，队列为空
        System.out.println(referenceQueue.poll());

        System.out.println("=======================");
        object = null;
        System.gc();
        Thread.sleep(1000);
        System.out.println(object);
        System.out.println(phantomReference.get());
        // 队列不为空。软引用、弱引用、虚引用在被GC回收前，会放入引用队列中。
        System.out.println(referenceQueue.poll());
    }
}
