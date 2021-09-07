package study;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/6/17 3:34 下午
 */
public class TestReflection2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        // 通过new的方式创建实例对象
        People people1 = new People();
        System.out.println(people1);

        // 使用反射的方式创建实例对象
        String className = "study.People";
        // 获取类对象
        Class classObject = Class.forName(className);
        // 获取构造器对象
        Constructor c = classObject.getConstructor();
        // 获取实例对象
        People people2 = (People) c.newInstance();
        System.out.println(people2);
    }
}
