package lc_zhousai_255;

import java.util.Map;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/8/22 9:55 上午
 */
public class T_03 {
    public static void main(String[] args) {

    }

    public int minimizeTheDifference(int[][] mat, int target) {
        int m = mat.length;
        int n = mat[0].length;
        int min = Integer.MAX_VALUE;
        if (m == 1) {
            for (int i = 0; i < n; i++) {
                min = Math.min(min, Math.abs(target - mat[0][i]));
            }
            return min;
        }
        if (n == 1) {
            for (int i = 0; i < m; i++) {
                min = Math.min(min, Math.abs(target - mat[i][0]));
            }
            return min;
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                min = minimizeTheDifference(mat, target - mat[i][i]);
            }
        }

        return min;
    }
}
