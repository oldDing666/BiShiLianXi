package atGuiGuStudy.lambda;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/10/2 7:18 下午
 * <p>
 * java内置的4大核心函数式接口
 * 消费型接口 Consumer<T>    void accept(T t)
 * 供给型接口 Supplier<T>    T get()
 * 函数型接口 Function<T,R>  R apply(T t)
 * 断定型接口 Predicate<T>   boolean test(T t)
 */
public class LambdaTest2 {

    @Test
    public void test1() {
        happyTime(500, new Consumer<Double>() {
            @Override
            public void accept(Double aDouble) {
                System.out.println("买了一个瓜，花费了 " + aDouble);
            }
        });
        System.out.println("**********使用lambda表达式重写**********");
        happyTime(400, money -> System.out.println("萨日朗，赔了 " + money));

    }

    public void happyTime(double money, Consumer<Double> con) {
        con.accept(money);
    }

    @Test
    public void test2() {
        List<String> list = Arrays.asList("北京", "天津", "南京", "东京");
        System.out.println(filterString(list, new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.contains("京");
            }
        }));
        System.out.println("**********使用lambda表达式重写**********");
        System.out.println(filterString(list, s -> s.contains("京"))) ;
    }

    public List<String> filterString(List<String> list, Predicate<String> pre) {
        List<String> res = new ArrayList<>();
        for (String s : list) {
            if (pre.test(s)) {
                res.add(s);
            }
        }
        return res;
    }
}
