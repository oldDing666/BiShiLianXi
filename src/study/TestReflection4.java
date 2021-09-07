package study;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/6/17 4:42 下午
 */
public class TestReflection4 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        People people = new People();
        people.setName("pdd");
        System.out.println(people.getName());

        Class classObject = people.getClass();
        // 前面的字符串参数为要调用的方法名
        // 后面的参数是要调用的方法的参数类型的类对象，可以有多个
        Method method = classObject.getMethod("setName", String.class);
        // 前面的参数为要调用方法所在类的实例对象，
        // 后面的参数为要调用的方法的参数，可以有多个
        method.invoke(people, "骚猪");

        // 通过反射调用People类的getName方法
        Method method2 = classObject.getMethod("getName");
        System.out.println(method2.invoke(people));
    }
}
