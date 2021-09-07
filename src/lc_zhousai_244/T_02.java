package lc_zhousai_244;

import java.util.Arrays;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/6/6 10:25 上午
 */
public class T_02 {
    public static void main(String[] args) {
//        int nums[] = {5, 1, 3};
//        int nums[] = {1, 1, 1};
        int nums[] = {1, 1, 2, 2, 3};
        System.out.println(new T_02().reductionOperations(nums));
    }

    int count = 0;

    public int reductionOperations(int[] nums) {
        if (nums.length <= 1)
            return 0;
        Arrays.sort(nums);
        int n = nums.length;
        if (nums[n - 1] == nums[0])
            return 0;
        dfs(nums);
        return count;
    }

    private void dfs(int[] nums) {
//        Arrays.sort(nums);
        int n = nums.length;
        if (nums[0] == nums[n - 1])
            return;
        for (int i = n - 1; i > 0; i--) {
            if (nums[i] != nums[i - 1]) {
                nums[i] = nums[i - 1];
                count++;
//                System.out.println(Arrays.toString(nums));
                dfs(nums);
                return;
            }
        }
    }
}
