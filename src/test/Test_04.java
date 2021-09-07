package test;

import java.util.Arrays;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/4/19 7:38 下午
 */
public class Test_04 {
    public static void main(String[] args) {
        int nums[] = new int[]{1, 3, 5, 7, 2, 4, 6, 8};
        System.out.println(Arrays.toString(nums));
        quickSort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    public static void quickSort(int[] nums, int left, int right) {
        if (left >= right)
            return;
        int i = left, j = right;
        // 基准数
        int temp = nums[left];
        while (i < j) {
            // 从右向左找第一个小于temp的数
            while (nums[j] >= temp && i < j)
                j--;
            // 从左向右找第一个大于等于temp的数
            while (nums[i] <= temp && i < j)
                i++;
            if (i < j) {
                int t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
            }
        }
        // 更新基准数的位置，此时i所处的位置应该存放基准数
        nums[left] = nums[i];
        nums[i] = temp;
        quickSort(nums, left, i - 1);
        quickSort(nums, i + 1, right);
    }
}
