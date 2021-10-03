package test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/9/26 3:13 下午
 */
public class T_31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String ss[] = str2.substring(0, str2.length() - 1).split(" ");
        for (int i = 0; i < ss.length; i++) {
            if (str1.contains(ss[i])) {
                str1 = str1.replace(ss[i], " ");
            } else {
                System.out.println("false");
                return;
            }
        }
        str1 = str1.replace(" ", "");
        if (str1.equals("")) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
