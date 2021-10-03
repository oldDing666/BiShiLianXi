package JZOffer_v1;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/9/28 3:46 下午
 */
public class T_16 {
    public double myPow(double x, int n) {
        double res = 1;
        // n为负数的话，-n可能会超出int的界限
        // int的取值范围为 [-2147483648, 2147483647]
        long b = n;
        if (b < 0) {
            b = -b;
            x = 1 / x;
        }
        while (b > 0) {
            if (b % 2 == 1) {
                res = res * x;
            }
            x = x * x;
            b = b >> 1;
        }
        return res;
    }
}
