package atGuiGuStudy.StreamAPI;

import atGuiGuStudy.lambda.Employee;
import atGuiGuStudy.lambda.EmployeeData;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/10/3 3:21 下午
 */
public class StreamAPI {
    // 集合获取stream
    @Test
    public void test1() {
        List<Employee> employees = EmployeeData.getEmployees();
        // 返回一个顺序流
        Stream<Employee> stream = employees.stream();
        // 返回一个并行流
        Stream<Employee> parallelStream = employees.parallelStream();
    }

    // 数组获取stream
    @Test
    public void test2() {
        // 基本类型
        int[] arr = new int[]{1, 2, 3, 4, 5};
        IntStream stream = Arrays.stream(arr);

        // 自定义类型
        Employee[] employees = new Employee[]{
                new Employee(),
                new Employee(),
        };
        Stream<Employee> employeeStream = Arrays.stream(employees);
    }

    // 通过Stream的of()获取
    @Test
    public void test3() {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
    }

    // 创建无限流
    @Test
    public void test4() {
        // 迭代
        // 遍历前10个偶数
        Stream.iterate(0, t -> t + 2).limit(10).forEach(System.out::println);
        // 生成
        Stream.generate(Math::random).limit(10).forEach(System.out::println);
    }
}
