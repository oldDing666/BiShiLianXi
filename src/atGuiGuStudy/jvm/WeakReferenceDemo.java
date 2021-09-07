package atGuiGuStudy.jvm;

import java.lang.ref.WeakReference;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/8/27 10:35 上午
 */
public class WeakReferenceDemo {
    public static void main(String[] args) {
        Object object = new Object();
        WeakReference<Object> weakReference = new WeakReference<>(object);
        System.out.println(object);
        System.out.println(weakReference);
        System.out.println(weakReference.get());

        object = null;
        System.gc();
        System.out.println("========================");
        System.out.println(object);
        System.out.println(weakReference);
        System.out.println(weakReference.get());
    }
}
