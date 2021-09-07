package lc_zhousai_247;

import java.util.Arrays;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/6/27 10:33 上午
 */
public class T_01 {
    public static void main(String[] args) {
        System.out.println(111);
    }

    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n - 1] * nums[n - 2] - nums[0] * nums[1];
    }
}
