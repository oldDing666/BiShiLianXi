package atGuiGuStudy.lambda;

import org.junit.Test;

import java.util.Comparator;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/10/2 10:09 上午
 */
public class LambdaTest {

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
        Runnable r2 = () -> System.out.println("我在北京吃烤鸭");
        r2.run();
    }

    @Test
    public void test2() {
        Comparator<Integer> com1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        };
        System.out.println(com1.compare(12, 21));
        System.out.println("**********使用lambda表达式重写**********");
        // lambda表达式写法 ->
        Comparator<Integer> com2 = (o1, o2) -> Integer.compare(o1, o2);
        System.out.println(com2.compare(21, 12));

        System.out.println("**********使用方法引用第二次重写**********");
        // 方法引用 ::
        Comparator<Integer> com3 = Integer::compareTo;
        System.out.println(com3.compare(21, 12));
    }
}
