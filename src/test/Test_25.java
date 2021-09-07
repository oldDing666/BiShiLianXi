package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/5/26 5:04 下午
 */
public class Test_25 {
    public static void main(String[] args) {
        Student student = null;
        try {
            String inputFilePath = "./student.ser";
            FileInputStream fis = new FileInputStream(inputFilePath);
            ObjectInputStream ois = new ObjectInputStream(fis);
            student = (Student) ois.readObject();
            ois.close();
            fis.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("student对象反序列化完成");
        System.out.println("name: " + student.name);
        System.out.println("address: " + student.address);
        System.out.println("age: " + student.age);
        System.out.println("score: " + student.score);
    }
}
