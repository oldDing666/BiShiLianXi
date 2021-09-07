package lc_zhousai_239;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/5/2 9:35 上午
 */
public class T_01 {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5};
        int target = 5;
        int start = 3;
        System.out.println(new T_01().getMinDistance(nums, target, start));
    }

    public int getMinDistance(int[] nums, int target, int start) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                min = Math.min(Math.abs(i - start), min);
            }
        }
        return min;
    }
}
