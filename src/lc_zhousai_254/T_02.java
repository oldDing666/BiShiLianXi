package lc_zhousai_254;

import java.util.Arrays;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/8/15 10:42 上午
 */
public class T_02 {
    public static void main(String[] args) {
//        int nums[] = {1, 2, 3, 4, 5};
//        int nums[] = {1, 5, 2, 6, 3, 7, 4, 8};
//        int nums[] = {3, 1, 12, 10, 7, 6, 17, 14, 4, 13};
        int nums[] = {42, 6, 10, 21, 26, 44, 31, 18, 25, 48, 35, 2, 29, 5, 20};
        System.out.println(Arrays.toString(rearrangeArray(nums)));
    }

    public static int[] rearrangeArray(int[] nums) {
        Arrays.sort(nums);
        int nums1[];
        if (nums.length % 2 == 1) {
            nums1 = new int[nums.length / 2 + 1];
        } else {
            nums1 = new int[nums.length / 2];
        }
        System.arraycopy(nums, 0, nums1, 0, nums1.length);
        int nums2[] = new int[nums.length - nums1.length];
        System.arraycopy(nums, nums1.length, nums2, 0, nums2.length);
        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                nums[i] = nums1[index1];
                index1++;
            } else {
                nums[i] = nums2[index2];
                index2++;
            }
        }
        return nums;
    }
}
