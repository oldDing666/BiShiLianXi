package lc_zhousai_240;

import java.util.Arrays;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/5/9 9:39 上午
 */
public class T_03 {
    public static void main(String[] args) {
//        int nums[] = new int[]{1, 2, 3, 2};
//        int nums[] = new int[]{2, 3, 3, 1, 2};
        int nums[] = new int[]{3, 1, 5, 6, 4, 2};
//        int nums[] = new int[]{1, 1, 3, 2, 2, 2, 1, 5, 1, 5};
        System.out.println(new T_03().maxSumMinProduct(nums));
    }

    public int maxSumMinProduct(int[] a) {
        int n = a.length;
        // left[]、right[]数组记录的都是下标
        int[] left = new int[n];
        int[] right = new int[n];
        // 向左寻找比a[i]大的数
        for (int i = 0; i < n; i++) {
            left[i] = i - 1;
            while (left[i] >= 0 && a[left[i]] >= a[i]) {
                left[i] = left[left[i]];
            }
        }
        // 向右寻找比a[i]大的数
        for (int i = n - 1; i >= 0; i--) {
            right[i] = i + 1;
            while (right[i] < n && a[right[i]] >= a[i]) {
                right[i] = right[right[i]];
            }
        }

        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));

        long ans = 0;
        // ps[]为累加和数组，方便计算
        long[] ps = new long[n];
        for (int i = 0; i < n; i++) {
            ps[i] = a[i];
            if (i > 0)
                ps[i] += ps[i - 1];
        }
        long best = 0;
        for (int i = 0; i < n; i++) {
            best = Math.max(best, a[i] * sum(ps, left[i] + 1, right[i] - 1));
        }
        int mod = (int) 1e9 + 7;
        return (int) (best % mod);
    }

    long sum(long[] ps, int l, int r) {
        long ans = ps[r];
        if (l > 0) {
            ans -= ps[l - 1];
        }
        return ans;
    }
}
