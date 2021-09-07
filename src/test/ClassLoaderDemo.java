package test;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/4/28 3:01 下午
 */
public class ClassLoaderDemo {
    public static void main(String[] args) {
        System.out.println("ClassLoaderDemo类的类加载器是：");
        System.out.println(ClassLoaderDemo.class.getClassLoader());
        System.out.println("ClassLoaderDemo类的父类加载器是：");
        System.out.println(ClassLoaderDemo.class.getClassLoader().getParent());
        System.out.println("ClassLoaderDemo类的祖父类加载器是：");
        System.out.println(ClassLoaderDemo.class.getClassLoader().getParent().getParent());
    }
}
