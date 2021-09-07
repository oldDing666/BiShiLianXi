package atGuiGuStudy.juc;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/8/18 3:04 下午
 */
class Person {
    private Integer id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name) {
        this.name = name;
    }
}

public class TestTransferValue {
    public void changeValue1(int age) {
        age = 30;
    }

    public void changeValue2(Person person) {
        person.setName("xxx");
    }

    public void changeValue3(String str) {
        str = "xxx";
    }

    public static void main(String[] args) {
//        Lock lock = new ReentrantLock();

        TestTransferValue test = new TestTransferValue();
        int age = 20;
        test.changeValue1(age);
        System.out.println(age); // 20

        Person person = new Person("abc");
        test.changeValue2(person);
        System.out.println(person.getName()); // xxx

        // String是一种特殊的引用类型，存储在常量池中
        String str = "abc";
        String str2 = new String("abc");
        test.changeValue3(str);
        test.changeValue3(str2);
        System.out.println(str); // abc
        System.out.println(str2); // abc
    }
}
