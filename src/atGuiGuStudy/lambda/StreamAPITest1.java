package atGuiGuStudy.lambda;

import org.junit.Test;

import java.util.List;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/10/3 4:05 下午
 */
public class StreamAPITest1 {

    // 1-筛选与切片
    @Test
    public void test1() {
        List<Employee> list = EmployeeData.getEmployees();
        // filter:查询薪资大于7000的员工信息
        list.stream().filter(employee -> employee.getSalary() > 7000).forEach(System.out::println);
        System.out.println("**************************");
        // 一旦执行终止操作，就得重新创建一个流
        // limit:截断流
        list.stream().limit(3).forEach(System.out::println);
        System.out.println("**************************");
        // skip:跳过元素
        list.stream().skip(3).forEach(System.out::println);
        System.out.println("**************************");
        // 跳过的元素数量，大于，流中的元素个数，返回一个空流
        list.stream().skip(30).forEach(System.out::println);
        System.out.println("**************************");
        // distinct：通过流中元素的hashcode()和equals()去除重复元素
        list.add(new Employee(1008, "扎克伯格", 35, 2500.32));
        list.add(new Employee(1008, "扎克伯格", 35, 2500.32));
        list.add(new Employee(1008, "扎克伯格", 35, 2500.32));
        System.out.println("原来的list有重复的值");
        list.stream().forEach(System.out::println);
        System.out.println("在流中去除重复的值");
        list.stream().distinct().forEach(System.out::println);
    }
}
