package ali_06_29;

import java.util.Scanner;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/6/29 7:12 下午
 */
public class T_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;
        int[] num = new int[n];
        int[][] lr = new int[m][2];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            lr[i][0] = sc.nextInt();
            lr[i][1] = sc.nextInt();
            if (num[lr[i][0]-1] != num[lr[i][1]-1]) {
                count++;
            }
        }
        System.out.println(count);
    }
}
