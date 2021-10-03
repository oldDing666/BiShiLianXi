package JZOffer_v1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/9/25 11:24 上午
 */
public class T_29 {
    public static void main(String[] args) {
        int m[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(Arrays.toString(spiralOrder(m)));
    }

    public static int[] spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return new int[]{};
        }
        List<Integer> list = new ArrayList<>();
        int cnt = 0;
        int left = 0, right = matrix[0].length - 1, up = 0, down = matrix.length - 1;
        while (cnt <= matrix.length * matrix[0].length) {
            // 从左上到右上
            if (cnt >= matrix.length * matrix[0].length)
                break;
            for (int i = left; i <= right; i++) {
                list.add(matrix[up][i]);
                cnt++;
            }
            up++;

            // 从右上到右下
            if (cnt >= matrix.length * matrix[0].length)
                break;
            for (int i = up; i <= down; i++) {
                list.add(matrix[i][right]);
                cnt++;
            }
            right--;

            // 从右下到左下
            if (cnt >= matrix.length * matrix[0].length)
                break;
            for (int i = right; i >= left; i--) {
                list.add(matrix[down][i]);
                cnt++;
            }
            down--;

            // 从左下到左上
            if (cnt >= matrix.length * matrix[0].length)
                break;
            for (int i = down; i >= up; i--) {
                list.add(matrix[i][left]);
                cnt++;
            }
            left++;
        }

        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
