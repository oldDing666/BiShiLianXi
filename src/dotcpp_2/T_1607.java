package dotcpp_2;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/6/5 2:50 下午
 */
public class T_1607 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println((int) (n * Math.log10(2) + 1));
        BigInteger n1 = new BigInteger("2");
        BigInteger n2 = new BigInteger("1");
        n1 = help(n1, n);
        n1 = n1.subtract(n2);
        String str = n1.toString();
//        System.out.println(str);
//        System.out.println(str.length());
        if (str.length() < 500) {
            StringBuilder res = new StringBuilder();
            for (int i = 1; i <= 500 - str.length(); i++) {
                res.append("0");
            }
            res.append(str);
            help2(res.toString());
        } else {
            str = str.substring(str.length() - 500, str.length());
            help2(str);
        }

    }

    private static void help2(String str) {
        int j = 0;
        for (int i = 50; i <= 500; i += 50) {
            System.out.println(str.substring(j, i));
            j = i;
        }
    }

    private static BigInteger help(BigInteger x, int y) {
        BigInteger w = new BigInteger("10");
        w = w.pow(500);
        BigInteger res = new BigInteger("1");
        while (y > 0) {
            if (y % 2 == 1) {
                res = res.multiply(x).mod(w);
            }
            y = y >> 1;
            x = x.multiply(x).mod(w);
        }
        return res;
    }
}
