package zijie_06_13;

import java.util.Scanner;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/6/13 5:39 下午
 */
public class T_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            t--;
            int n = sc.nextInt();
            if (n == 0) {
                System.out.println(0);
                continue;
            } else if (n == 1) {
                System.out.println(1);
                continue;
            } else if (n == 2) {
                System.out.println(4);
                continue;
            } else if (n == 3) {
                System.out.println(5);
                continue;
            }
            int[] dp = new int[n];
            dp[0] = 1;
            dp[1] = 4;
            dp[2] = 5;
            int temp = 4;
            for (int i = 3; i < n; i++) {
                dp[i] = dp[i - 2] + temp;
                temp++;
                i++;
                if (i < n)
                    dp[i] = dp[i - 1] + 1;
            }
            System.out.println(dp[n - 1]);
        }
    }
}
