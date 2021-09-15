package JZOffer_v1;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/9/15 11:15 上午
 */
public class T_04 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix.length == 0)
            return false;
        int n = 0;
        int m = matrix[0].length - 1;
        while (n < matrix.length && m >= 0) {
            if (target == matrix[n][m])
                return true;
            else if (target > matrix[n][m]) {
                n++;
            } else {
                m--;
            }
        }
        return false;
    }
}
