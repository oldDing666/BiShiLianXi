package nc_yuesai_33;

import java.util.Scanner;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/4/17 7:57 下午
 */
public class T_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            // 可以买n瓶可乐，两种可乐价格一样
            int n = sc.nextInt();
            // a个瓶子，可以换一瓶b
            int a = sc.nextInt();
            // b个瓶子，可以换一瓶a
            int b = sc.nextInt();

            // 喝到的总数
            int count = n;
            int min = Math.min(a, b);
            int max = Math.max(a, b);
            while (n / min > min) {
                // 先换n1瓶最小的
                int n1 = n / min;
                int n2 = n % min;
            }

        }
    }
}
