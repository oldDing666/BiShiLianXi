package dotcpp;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/6/5 8:40 上午
 */

import java.math.BigInteger;

import java.util.Scanner;


public class T_1607_2 {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n;
        n = cin.nextInt();
        System.out.println((int) (n * Math.log10(2) + 1));//位数
        String o = "2";
        BigInteger a = new BigInteger(o);
        a = qsm(a, n);
        a = a.subtract(BigInteger.ONE);
        String s = a.toString();
        if (s.length() < 500) {
            String t = "";
            int x = 500 - s.length();
            for (int i = 0; i < x; i++)
                t = t + '0';
            s = t + s;
        }
        int cnt = 0;
        String t = "";
        for (int i = s.length() - 500; i < s.length(); i++) {
            t = t + s.charAt(i);
            cnt++;
            if (cnt == 50)//每行输出50位共输出10行
            {
                cnt = 0;
                System.out.println(t);
                t = "";
            }
        }
    }


    private static BigInteger qsm(BigInteger x, int y) {//快速幂
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

}