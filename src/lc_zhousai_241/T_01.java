package lc_zhousai_241;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/5/16 10:05 上午
 */
public class T_01 {
    public static void main(String[] args) {
//        int nums[] = {1, 3};
        int nums[] = {5, 1, 6};
        System.out.println(new T_01().subsetXORSum(nums));
    }

    public int subsetXORSum(int[] nums) {
        if (nums.length == 0)
            return 0;
        List<List<Integer>> all = help(nums);
        int res = 0;
        for (List<Integer> arr : all) {
            int temp = 0;
            if (arr.size() == 0) {
                continue;
            }
            for (int i : arr) {
                temp = temp ^ i;
            }
            res += temp;
        }
        return res;
    }

    public List<List<Integer>> help(int[] nums) {
        int count = (int) Math.pow(2, nums.length);
        List<List<Integer>> arrays = new ArrayList<>();
        for (int i = 1; i < count; i++) {
            List<Integer> subarray = new ArrayList<>();
            int temp = i;
            int index = 0;
            while (temp != 0) {
                if ((temp & 1) == 1) {
                    subarray.add(nums[index]);
                }
                index++;
                temp = temp >> 1;
            }
            arrays.add(subarray);
        }
        return arrays;
    }
}
