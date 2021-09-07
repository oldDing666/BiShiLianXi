package lc_zhousai_237;

import java.util.Arrays;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/4/18 10:19 上午
 */
public class T_02 {
    public int maxIceCream(int[] costs, int coins) {
        int count = 0;
        Arrays.sort(costs);
        for (int i = 0; i < costs.length; i++) {
            if (coins >= costs[i]) {
                count++;
                coins -= costs[i];
            } else {
                break;
            }
        }
        return count;
    }
}
