package test;

import java.util.Arrays;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/5/26 11:54 上午
 */
public class Test_20 {
    public static void main(String[] args) {
        System.out.println(help(2));
    }

    public static int help(int n) {
        System.out.println("n = " + n);
        try {
            System.out.println("try块，return n*n: ");
            return n * n;
        } finally {
            System.out.println("finally块，return n:");
            return n;
        }
    }
}
