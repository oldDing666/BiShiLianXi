package test;

import javax.swing.*;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/5/24 8:56 下午
 */

public class Test_17 {
    public static void main(String[] args) {
//        Dog dog = new Dog();
//        dog.eat();
//
//        Animal animal = new Dog();
//        animal.eat();

//        Child child = new Child();
//        // id和name是父类的属性
//        child.setId(1);
//        child.setName("tom");
//        // age是child的属性
//        child.setAge(8);
//        System.out.println(child.getId());
//        System.out.println(child.getName());
//        System.out.println(child.getAge());
//        // child重写了父类的job方法
//        child.job();
//        // child调用了父类的eat方法
//        child.eat();

        Person person1 = new Child();
        person1.job();
        person1.eat();
        // 父类引用无法访问子类的属性
        // person1.setAge();

        Person person2 = new Adult();
        person2.job();
        person2.eat();

    }
}

class Person {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void job() {
        System.out.println("people's job");
    }

    public void eat() {
        System.out.println("people need to eat");
    }
}

class Child extends Person {
    private int age;
    public String address;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void job() {
        System.out.println("child's job");
    }
}

class Adult extends Person {
    public void job() {
        System.out.println("Adult's job");
    }
}

class Animal {
    public static void play() {
        System.out.println("Animal play");
    }

    public void eat() {
        System.out.println("Animal eat");
    }
}

class Dog extends Animal {
    public static void play() {
        System.out.println("Dog play");
    }

    @Override
    public void eat() {
        System.out.println("Dog eat");
    }
}

interface fruit {
    public static final int id = 0;

    public abstract void eat();

    public void growth();

    public static void sell() {

    }
}