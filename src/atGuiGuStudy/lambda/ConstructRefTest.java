package atGuiGuStudy.lambda;

import org.junit.Test;
import sun.security.util.Length;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/10/2 9:08 下午
 */
public class ConstructRefTest {

    // 构造器引用
    // 无参构造方法
    @Test
    public void test1() {
        Supplier<Employee> sup1 = () -> new Employee();
        System.out.println(sup1.get());
        System.out.println("**********使用构造器引用替换lambda表达式");
        Supplier<Employee> sup2 = Employee::new;
        System.out.println(sup2.get());
    }

    // 有一个参数的构造方法
    @Test
    public void test2() {
        Function<Integer, Employee> fun1 = (o) -> new Employee(o);
        System.out.println(fun1.apply(123));
        System.out.println("**********使用构造器引用替换lambda表达式");
        Function<Integer, Employee> fun2 = Employee::new;
        System.out.println(fun2.apply(321));
    }

    // 有两个参数的构造方法
    @Test
    public void test3() {
        BiFunction<Integer, String, Employee> bif1 = (o1, o2) -> new Employee(o1, o2);
        System.out.println(bif1.apply(123, "tom"));
        System.out.println("**********使用构造器引用替换lambda表达式");
        BiFunction<Integer, String, Employee> bif2 = Employee::new;
        System.out.println(bif1.apply(321, "jack"));
    }

    // 数组引用
    @Test
    public void test4() {
        Function<Integer, String[]> fun1 = lenght -> new String[lenght];
        System.out.println(Arrays.toString(fun1.apply(5)));
        System.out.println("**********使用数组引用替换lambda表达式");
        Function<Integer, String[]> fun2 = String[]::new;
        System.out.println(Arrays.toString(fun2.apply(10)));
    }
}
