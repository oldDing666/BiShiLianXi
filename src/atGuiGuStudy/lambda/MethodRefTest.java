package atGuiGuStudy.lambda;

import org.junit.Test;

import java.io.PrintStream;
import java.util.Comparator;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/10/2 8:13 下午
 * <p>
 * 当要传递给Lambda体的操作，已经有`实现的方法`了，就可以使用方法引用
 */
public class MethodRefTest {

    // 方法引用使用情景一
    // 对象::实例方法
    @Test
    public void test1() {
        Consumer<String> con1 = str -> System.out.println(str);
        con1.accept("北京");
        System.out.println("**********使用方法引用替换lambda表达式");
        PrintStream ps = System.out;
        Consumer<String> con2 = ps::println;
        con2.accept("beijing");
    }

    @Test
    public void test2() {
        Employee emp = new Employee(1001, "马化腾", 34, 6000.38);
        Supplier<String> sup1 = () -> emp.getName();
        System.out.println(sup1.get());
        System.out.println("**********使用方法引用替换lambda表达式");
        Supplier<String> sup2 = emp::getName;
        System.out.println(sup2.get());
    }

    // 方法引用使用情景二
    // 类::静态方法
    @Test
    public void test3() {
        Comparator<Integer> com1 = (o1, o2) -> Integer.compare(o1, o2);
        System.out.println(com1.compare(12, 21));
        System.out.println("**********使用方法引用替换lambda表达式");
        Comparator<Integer> com2 = Integer::compare;
        System.out.println(com2.compare(21, 12));
    }

    @Test
    public void test4() {
        Function<Double, Long> fun1 = o -> Math.round(o);
        System.out.println(fun1.apply(3.14));
        System.out.println("**********使用方法引用替换lambda表达式");
        Function<Double, Long> fun2 = Math::round;
        System.out.println(fun2.apply(3.14));
    }

    // 方法引用使用情景三
    // 类::实例方法
    @Test
    public void test5() {
        Comparator<String> com1 = (o1, o2) -> o1.compareTo(o2);
        System.out.println(com1.compare("12", "21"));
        System.out.println("**********使用方法引用替换lambda表达式");
        Comparator<String> com2 = String::compareTo;
        System.out.println(com2.compare("12", "21"));
    }

    @Test
    public void test6() {
        BiPredicate<String, String> bip1 = (s1, s2) -> s1.equals(s2);
        System.out.println(bip1.test("abc", "abc"));
        System.out.println("**********使用方法引用替换lambda表达式");
        BiPredicate<String, String> bip2 = String::equals;
        System.out.println(bip2.test("abc", "acb"));
    }

    @Test
    public void test7() {
        Employee emp = new Employee(1001, "马化腾", 34, 6000.38);
        Function<Employee, String> fun1 = t -> t.getName();
        System.out.println(fun1.apply(emp));
        System.out.println("**********使用方法引用替换lambda表达式");
        Function<Employee, String> fun2 = Employee::getName;
        System.out.println(fun1.apply(emp));
    }
}
