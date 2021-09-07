package study;

import java.lang.reflect.Field;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/6/17 4:03 下午
 */
public class TestReflection3 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        People people = new People();
        people.setId(10);
        people.setName("骚猪");
        System.out.println("通过公有的get方法获取值：");
        System.out.println(people.getId());
        System.out.println(people.getName());

        Class classObject = people.getClass();
        // getDeclaredField只能获取本类的属性，可以获取private权限的
        // getField能获取父类的属性，但只能获取public权限的
        Field field1 = classObject.getDeclaredField("id");
        Field field2 = classObject.getDeclaredField("name");
        // 当属性是私有的时候，要设置为true
        field1.setAccessible(true);
        field2.setAccessible(true);
        field1.set(people, 20);
        field2.set(people, "dsm");
        System.out.println("通过反射的方式获取值：");
        System.out.println(field1.get(people));
        System.out.println(field2.get(people));
    }
}
