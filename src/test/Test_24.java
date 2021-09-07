package test;

import java.io.*;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/5/26 4:24 下午
 */
public class Test_24 {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("tom");
        student.setAddress("bei jing");
        student.setAge(18);
        student.setScore(100);

        try {
            String outputFilePath = "./student.ser";
            FileOutputStream fos = new FileOutputStream(outputFilePath);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(student);
            oos.close();
            fos.close();
            System.out.println("student对象数据已经序列化至./student.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
