package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/5/26 3:13 下午
 */
public class Test_21 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();
        String str3 = br.readLine();
        int num1 = Integer.parseInt(str3);
        String str4 = br.readLine();
        double num2 = Double.parseDouble(str4);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(num1);
        System.out.println(num2);
    }
}
