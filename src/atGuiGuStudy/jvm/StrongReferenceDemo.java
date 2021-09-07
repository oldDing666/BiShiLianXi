package atGuiGuStudy.jvm;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/8/27 10:01 上午
 */
public class StrongReferenceDemo {
    public static void main(String[] args) {
        // 这样的定义默认就是强引用
        Object obj1 = new Object();
        // 引用赋值，obj2引用指向obj1引用指向的对象
        Object obj2 = obj1;
        // obj1置空
        obj1 = null;
        System.gc();
        // obj1被回收
        System.out.println(obj1);
        // obj2不会被回收
        System.out.println(obj2);
    }
}
