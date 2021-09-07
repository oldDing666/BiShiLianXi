package tw_08_27;

import java.util.Arrays;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/8/27 3:26 下午
 */
public class T_01 {
    public static void main(String[] args) {
        int nums[] = new int[]{5,2,4,6};
        sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(count);
    }
    static int count = 0;
    private static void sort(int[] nums) {
        int n = nums.length;
        for (int i = 0; i <= n-2; i++) {
            for (int j = 0; j <= n-2; j++) {
                if (nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    count++;
                }
            }
        }
    }
}
