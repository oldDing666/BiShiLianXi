package JZOffer_v1;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/9/15 10:47 上午
 */
public class T_10 {
    public static void main(String[] args) {
        System.out.println(fibV3(45));
    }

    public static int fib(int n) {
        if (n == 0 || n == 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static int fibV2(int n) {
        if (n == 0 || n == 1)
            return n;
        int[] nums = new int[n + 1];
        nums[0] = 0;
        nums[1] = 1;

        for (int i = 2; i <= n; i++) {
            nums[i] = nums[i - 1] + nums[i - 2];
            nums[i] = nums[i] % 1000000007;
        }
        return nums[n] % 1000000007;
    }

    public static int fibV3(int n) {
        if (n == 0 || n == 1)
            return n;
        int pre = 0;
        int cur = 1;
        for (int i = 2; i <= n; i++) {
            cur = pre + cur;
            pre = cur - pre;
            cur = cur % 1000000007;
        }
        return cur;
    }
}
