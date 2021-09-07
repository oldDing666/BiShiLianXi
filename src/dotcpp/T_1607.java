package dotcpp;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/6/5 8:18 上午
 */
public class T_1607 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println((int) (n * Math.log10(2) + 1));
        BigInteger big = new BigInteger("2");
        BigInteger big2 = new BigInteger("1");
        big = ksm(big, n);
        big = big.subtract(big2);
        String str = big.toString();

        if (str.length() <= 500) {
            StringBuilder s = new StringBuilder();
            for (int i = 1; i <= 500 - str.length(); i++) {
                s.append("0");
            }
            s.append(str);
            help(s.toString());
        } else {
            String s = str.substring(str.length() - 500, str.length());
            help(s);
        }
    }

    private static BigInteger ksm(BigInteger x, int y) {//快速幂
        BigInteger w = new BigInteger("10");
        w = w.pow(500);
        BigInteger ans = BigInteger.ONE;
        while (y > 0) {
            if (y % 2 == 1)//为奇数
                ans = ans.multiply(x).mod(w);
            y >>= 1;
            x = x.multiply(x).mod(w);
        }
        return ans;
    }

    private static void help(String s) {
        int n = 0;
        for (int i = 50; i <= 500; i += 50) {
            System.out.println(s.substring(n, i));
            n = i;
        }
    }
}
