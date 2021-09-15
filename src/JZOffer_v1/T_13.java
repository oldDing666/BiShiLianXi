package JZOffer_v1;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/9/15 2:31 下午
 */
public class T_13 {
    public int movingCount(int m, int n, int k) {
        if (k == 0)
            return 1;
        boolean flag[][] = new boolean[m][n];
        return dfs(0, 0, k, flag);
    }

    private int dfs(int i, int j, int k, boolean flag[][]) {
        if (i < 0 || i >= flag.length || j < 0 || j >= flag[0].length || flag[i][j] || countSum(i) + countSum(j) > k)
            return 0;

        flag[i][j] = true;
        return dfs(i - 1, j, k, flag) + dfs(i, j + 1, k, flag) + dfs(i + 1, j, k, flag) + dfs(i, j - 1, k, flag) + 1;
    }

    private int countSum(int n) {
        int sum = 0;
        while (n / 10 != 0) {
            sum += n % 10;
            n /= 10;
        }
        sum += n;
        return sum;
    }
}
