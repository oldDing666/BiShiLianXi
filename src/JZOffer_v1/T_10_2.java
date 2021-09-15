package JZOffer_v1;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/9/15 11:32 上午
 */
public class T_10_2 {
    public int numWays(int n) {
        if (n == 0 || n == 1)
            return 1;
        int pre = 1;
        int cur = 1;
        for (int i = 2; i <= n; i++) {
            cur = pre + cur;
            pre = cur - pre;
            cur = cur % 1000000007;
        }
        return cur;
    }
}
