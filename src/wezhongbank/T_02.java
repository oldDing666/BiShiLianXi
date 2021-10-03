package wezhongbank;

import java.util.Scanner;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/9/23 9:11 下午
 */
public class T_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int [][]point = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                point[i][j] = sc.nextInt();
            }
        }
        String str = sc.nextLine();
    }
}
