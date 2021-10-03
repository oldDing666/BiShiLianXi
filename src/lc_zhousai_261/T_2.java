package lc_zhousai_261;

import java.util.Arrays;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/10/3 10:54 上午
 */
public class T_2 {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int[] res = new int[n];
        int m = rolls.length;
        int sum_m = Arrays.stream(rolls).sum();
        int sum_n = mean * (m + n) - sum_m;

        if (sum_n / (n * 1.0) < 1 || sum_n / (n * 1.0) > 6) {
            return new int[]{};
        } else {
            while (sum_n != 0) {
                for (int i = 0; i < n; i++) {
                    res[i]++;
                    sum_n--;
                    if (sum_n == 0) {
                        break;
                    }
                }
            }
        }
        return res;
    }
}
