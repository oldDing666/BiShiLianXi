package JZOffer_v1;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/9/15 11:11 上午
 */
public class T_03 {
    public int findRepeatNumber(int[] nums) {
        int arr[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (++arr[nums[i]] > 1)
                return nums[i];
        }
        return -1;
    }
}
