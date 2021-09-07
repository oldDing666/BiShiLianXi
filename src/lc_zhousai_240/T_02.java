package lc_zhousai_240;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/5/9 9:39 上午
 */
public class T_02 {
    public static void main(String[] args) {
        int nums1[] = new int[]{55, 30, 5, 4, 2};
        int nums2[] = new int[]{100, 20, 10, 10, 5};
        System.out.println(new T_02().maxDistance(nums1, nums2));
    }

    public int maxDistance(int[] nums1, int[] nums2) {
        if (nums1.length == 0 || nums2.length == 0)
            return 0;
        int max = 0;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = i + max; j < nums2.length; j++) {
                if (nums2[j] >= nums1[i]) {
                    max = Math.max(max, j - i);
                } else {
                    break;
                }
            }
        }
        return max;
    }
}
