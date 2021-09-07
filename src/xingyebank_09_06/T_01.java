package xingyebank_09_06;


import java.util.regex.Pattern;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/9/6 7:33 下午
 */

import java.util.Scanner;
public class T_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println("1==1");
            return;
        }
        System.out.println(help(n));
    }

    private static String help(int n) {
        StringBuilder sb = new StringBuilder();
        sb.append(n + "=");
        while (!isZhiShu(n)) {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (isZhiShu(2) && n % i == 0) {
                    sb.append(i + "*");
                    n = n / i;
                }
            }
        }
        sb.append(n);
        return sb.toString();
    }

    public static boolean isZhiShu(int n) {
        if (n == 1)
            return false;
        else if (n == 2) {
            return true;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0)
                    return false;
            }
        }
        return true;
    }
}
