package atGuiGuStudy.lambda;

import org.junit.Test;

import java.util.Comparator;
import java.util.function.Consumer;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/10/2 10:38 上午
 */
public class LambdaTest1 {

    // 语法格式一：无参，无返回值
    @Test
    public void test1() {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("我在北京吃炸鸡");
            }
        };
        r1.run();
        System.out.println("**********使用lambda表达式重写**********");
        Runnable r2 = () -> {
            System.out.println("我在北京吃烤鸭");
        };
        r2.run();
    }

    // 语法格式二：一个参数，无返回值
    @Test
    public void test2() {
        Consumer<String> con = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        con.accept("我套你猴子的！");
        System.out.println("**********使用lambda表达式重写**********");
        Consumer<String> con2 = (String s) -> {
            System.out.println(s);
        };
        con2.accept("得得得得得得！");
    }

    // 语法格式三：一个参数，数据类型可以省略
    @Test
    public void test3() {
        Consumer<String> con = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        con.accept("今天又是充满希望的一天！");
        System.out.println("**********使用lambda表达式重写**********");
        Consumer<String> con2 = (s) -> {
            System.out.println(s);
        };
        con2.accept("好运不会眷顾傻瓜～");
    }

    // 语法格式四：一个参数，参数的小括号可以省略
    @Test
    public void test4() {
        Consumer<String> con = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        con.accept("小狗勾又能有什么坏心思呢～");
        System.out.println("**********使用lambda表达式重写**********");
        Consumer<String> con2 = s -> {
            System.out.println(s);
        };
        con2.accept("生活不易，猫猫叹气～");
    }

    // 语法格式五：多个参数，多条执行语句，有返回值
    @Test
    public void test5() {
        Comparator<Integer> com1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                System.out.println(o1);
                System.out.println(o2);
                return Integer.compare(o1, o2);
            }
        };
        System.out.println(com1.compare(12, 21));
        System.out.println("**********使用lambda表达式重写**********");
        Comparator<Integer> com2 = (o1, o2) -> {
            System.out.println(o1);
            System.out.println(o2);
            return Integer.compare(o1, o2);
        };
        System.out.println(com2.compare(21, 12));
    }

    // 语法格式六：lambda体只有一条语句时，return与大括号都可以省略
    @Test
    public void test6() {
        Comparator<Integer> com1 = (o1, o2) -> {
            return o1.compareTo(o2);
        };
        System.out.println(com1.compare(12, 21));
        System.out.println("**********使用lambda表达式重写**********");
        Comparator<Integer> com2 = (o1, o2) -> o1.compareTo(o2);
        System.out.println(com2.compare(21, 12));
    }
}
