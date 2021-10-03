package JZOffer_v1;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/9/25 11:05 上午
 */
public class T_21 {
    public int[] exchange(int[] nums) {
        int r = nums.length - 1;
        for (int i = 0; i < r; i++) {
            if (nums[i] % 2 == 0) {
                int temp = nums[i];
                nums[i] = nums[r];
                nums[r] = temp;
                r--;
                i--;
            }
        }
        return nums;
    }
}
