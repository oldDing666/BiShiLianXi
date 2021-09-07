package test;

import java.io.Serializable;
import java.util.Arrays;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/5/26 11:07 上午
 */
public class Test_19 extends Object {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//        swap(a, b);
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);

//        int nums[] = {1, 2, 3, 4, 5};
//        change(nums);
//        System.out.println("nums: " + Arrays.toString(nums));
        Student student1 = new Student("student1");
        Student student2 = new Student("student2");
        swap(student1, student2);
        System.out.println("student1.name = " + student1.getName());
        System.out.println("student2.name = " + student2.getName());
    }

    public static void change(int[] arr) {
        arr[0] = 0;
        System.out.println("arr: " + Arrays.toString(arr));
    }

    public static void swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }

    public static void swap(Student s1, Student s2) {
        Student temp = s1;
        s1 = s2;
        s2 = temp;
        System.out.println("s1.name = " + s1.getName());
        System.out.println("s2.name = " + s2.getName());
    }
}

class Student implements Serializable {
    String name;
    transient String address;
    int age;
    transient int score;

    public Student() {
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}