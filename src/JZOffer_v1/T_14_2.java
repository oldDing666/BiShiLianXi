package JZOffer_v1;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/9/15 4:46 下午
 */
public class T_14_2 {
    public int cuttingRope(int n) {
        if (n == 2)
            return 1;
        else if (n == 3)
            return 2;
        int n1 = n % 3;
        int n2 = n / 3;
        long sum = 1;
        if (n1 == 0) {
            for (int i = 0; i < n2; i++) {
                sum *= 3;
                sum %= 1e9 + 7;
            }
        } else if (n1 == 2) {
            for (int i = 0; i < n2; i++) {
                sum *= 3;
                sum %= 1e9 + 7;
            }
            sum *= 2;
            sum %= 1e9 + 7;
        } else if (n1 == 1) {
            for (int i = 0; i < n2 - 1; i++) {
                sum *= 3;
                sum %= 1e9 + 7;
            }
            sum *= 4;
            sum %= 1e9 + 7;
        }
        return (int) sum;
    }
}
