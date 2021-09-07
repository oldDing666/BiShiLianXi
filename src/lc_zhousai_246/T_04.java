package lc_zhousai_246;

import java.util.Arrays;
import java.util.Map;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/6/20 10:30 上午
 */
public class T_04 {
    public static void main(String[] args) {
        int nums[] = {1, 3, 4, 8};
        int queries[][] = {{0, 1}, {1, 2}, {2, 3}, {0, 3}};
        System.out.println(Arrays.toString(new T_04().minDifference(nums, queries)));
    }

    public int[] minDifference(int[] nums, int[][] queries) {
        int n = queries.length;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = help(nums, queries[i]);
        }
        return res;
    }

    private int help(int[] nums, int[] query) {
        int n = query[1] - query[0] + 1;
        int[] arr = new int[n];
        System.arraycopy(nums, query[0], arr, 0, n);
        Arrays.sort(arr);
        if (arr[0] == arr[n - 1])
            return -1;
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1])
                min = Math.min(min, Math.abs(arr[i] - arr[i - 1]));
        }
        return min;
    }
}
