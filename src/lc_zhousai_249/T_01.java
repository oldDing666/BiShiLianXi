package lc_zhousai_249;

import java.util.Arrays;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/7/11 9:29 上午
 */
public class T_01 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 1};
        System.out.println(Arrays.toString(new T_01().getConcatenation(nums)));
    }

    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];
        System.arraycopy(nums, 0, ans, 0, nums.length);
        System.arraycopy(nums, 0, ans, nums.length, nums.length);
        return ans;
    }
}
