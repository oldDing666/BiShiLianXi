package study;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/6/17 3:10 下午
 */
public class TestReflection {
    public static void main(String[] args) throws ClassNotFoundException {
        String className = "study.People";
        Class classObject = Class.forName(className);
        Class classObject2 = People.class;
        Class classObject3 = new People().getClass();

        System.out.println(classObject);
        System.out.println(classObject2);
        System.out.println(classObject3);
    }
}