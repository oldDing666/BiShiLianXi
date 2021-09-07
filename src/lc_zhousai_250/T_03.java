package lc_zhousai_250;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/7/18 10:21 上午
 */
public class T_03 {
    public static void main(String[] args) {
//        int[][] points = {{1, 2, 3}, {1, 5, 1}, {3, 1, 1}};
//        int[][] points = {{1, 5}, {2, 3}, {4, 2}};
        int[][] points = {{2, 4, 0, 5, 5}, {0, 5, 4, 2, 5}, {2, 0, 2, 3, 1}, {3, 0, 5, 5, 2}};
        System.out.println(new T_03().maxPoints2(points));
    }

    public long maxPoints(int[][] points) {
        int m = points.length;
        int n = points[0].length;
        int max_j = 0;
        long sum = 0;
        for (int i = 0; i < m; i++) {
            int max = 0;
            if (i == 0) {
                for (int k = 0; k < n; k++) {
                    if (max < points[i][k]) {
                        max = points[i][k];
                        max_j = k;
                    }
                }
                sum += max;
                continue;
            }
            int max_jj = max_j;
            for (int j = 0; j < n; j++) {
                if (max < points[i][j] - Math.abs(max_j - j)) {
                    max = points[i][j] - Math.abs(max_j - j);
                    max_jj = j;
                }
            }
            max_j = max_jj;
            sum += max;
        }
        return sum;
    }

    public long maxPoints2(int[][] points) {
        int m = points.length;
        int n = points[0].length;
        long max = 0;
        for (int k = 0; k < n; k++) {
            int max_j = k;
            long sum = points[0][k];
            for (int i = 1; i < m; i++) {
                int temp = 0;
                int max_jj = max_j;
                for (int j = 0; j < n; j++) {
                    if (temp < points[i][j] - Math.abs(max_j - j)) {
                        temp = points[i][j] - Math.abs(max_j - j);
                        max_jj = j;
                    }
                }
                max_j = max_jj;
                sum += temp;
            }
            max = Math.max(max, sum);
        }
        return max;
    }
}
