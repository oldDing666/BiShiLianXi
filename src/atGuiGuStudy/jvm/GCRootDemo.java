package atGuiGuStudy.jvm;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/8/25 9:00 下午
 */
public class GCRootDemo {
    // 方法区中的类静态属性引用的对象
    // private GCRootDemo2 t2;
    // 方法区中常量引用的对象。
    // private final GCRootDemo3 t3 = new GCRootDemo3();

    // 虚拟机栈中引用的对象，方法存放在虚拟机栈中
    public static void m1(){
        GCRootDemo t1 = new GCRootDemo();
        System.gc();
        System.out.println("第一次GC完成");
    }

    public static void main(String[] args) {
        m1();
    }
}
