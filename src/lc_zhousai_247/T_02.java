package lc_zhousai_247;

import java.util.Arrays;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/6/27 10:34 上午
 */
public class T_02 {
    public static void main(String[] args) {
        int grid[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int m = grid.length;
//        int n = grid[0].length;
        for (int i = 0; i < m; i++) {
            System.out.println(Arrays.toString(grid[i]));
        }
        new T_02().rotateGrid(grid, 2);
        for (int i = 0; i < m; i++) {
            System.out.println(Arrays.toString(grid[i]));
        }
    }

    public int[][] rotateGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int ceng = Math.min(m, n) / 2;
        for (int i = 0; i < ceng; i++) {
            int num_ceng = (m - i * 2) * 2 + (n - i * 2 - 2) * 2;
            int repeat = k % num_ceng;
            for (int x = 0; x < repeat; x++) {
                int left_up = grid[i][i];
                // 上方的一行
                for (int j = i; j < n - i - 1; j++) {
                    grid[i][j] = grid[i][j + 1];
                }
                // 右上角
                grid[i][n - i - 1] = grid[i + 1][n - i - 1];
                int right_down = grid[m - 1 - i][n - 1 - i];

                // 下方一行
                for (int j = n - 1 - i; j >= i + 1; j--) {
                    grid[m - 1 - i][j] = grid[m - 1 - i][j - 1];
                }
                // 左下角
                grid[m - 1 - i][i] = grid[m - 1 - i - 1][i];


                // 左方一列
                for (int j = m - 1 - i - 1; j >= i + 1 + 1; j--) {
                    grid[j][i] = grid[j - 1][i];
                }
                grid[i + 1][i] = left_up;

                // 右方一列
                for (int j = i + 1; j <= m - 1 - i - 1 - 1; j++) {
                    grid[j][n - 1 - i] = grid[j + 1][n - 1 - i];
                }
                grid[m - 1 - i - 1][n - 1 - i] = right_down;
            }
        }
        return grid;
    }

}
