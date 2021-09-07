package test;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/5/26 9:12 上午
 */
public class Test_18 {
    public static void main(String[] args) {
        // 基本类型
        System.out.println(5 == 5.0);
        System.out.println(5 == 4.9999999999999999);
        System.out.println(5 == 5.0000000000000001);

        // 引用类型
        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");
        String s4 = new String("abc");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s3 == s4);

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s4));
    }
}
