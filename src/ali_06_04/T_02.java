package ali_06_04;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/6/4 9:36 上午
 */
public class T_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[][] net = new int[m][2];
        int speed[] = new int[m];
        for (int i = 0; i < m; i++) {
            net[i][0] = sc.nextInt();
            net[i][1] = sc.nextInt();
            speed[i] = sc.nextInt();
        }
        Arrays.sort(speed);
        int count = 0;
        for (int i = m - 1; i >= m - n + 1; i--) {
            if (speed[i] < k)
                count += k - speed[i];
        }
        System.out.println(count);
    }
}
