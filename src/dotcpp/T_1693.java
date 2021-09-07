package dotcpp;

import java.util.Scanner;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/6/5 9:21 上午
 */
public class T_1693 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] nums1 = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                nums1[i][j] = sc.nextInt();
            }
        }
        int[][] nums2 = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                nums2[i][j] = nums1[j][i];
                System.out.printf("%d ", nums2[i][j]);
            }
            System.out.println();
        }
    }
}
