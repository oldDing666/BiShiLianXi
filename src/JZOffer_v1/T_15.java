package JZOffer_v1;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/9/25 11:10 上午
 */
public class T_15 {
    public static void main(String[] args) {
        System.out.println(hammingWeight(11));
    }

    public static int hammingWeight(int n) {
        int cnt = 0;
        while (n != 0) {
            n = n & (n - 1);
            cnt++;
        }
        return cnt;
    }
}
