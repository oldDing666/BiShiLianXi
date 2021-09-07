package lc_zhousai_241;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/5/16 10:05 上午
 */
public class T_04 {
    public static void main(String[] args) {
        int a1[] = {1, 3, 5, 2, 4};
        int a2[] = new int[a1.length];
        System.arraycopy(a1, 0, a2, 0, a1.length);
        System.out.println(Arrays.toString(a1));
        Arrays.sort(a2);
        System.out.println(Arrays.toString(a1));
    }

    public int rearrangeSticks(int n, int k) {
        int num[] = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = i + 1;
        }
        permute(num);
        int count = 0;
        for (ArrayList<Integer> arr : res) {
            if (help(arr, k)) {
                count++;
                count %= 1000000007;
            }
        }
        return count;
    }

    ArrayList<ArrayList<Integer>> res;

    public ArrayList<ArrayList<Integer>> permute(int[] nums) {
        res = new ArrayList<ArrayList<Integer>>();
        if (nums == null || nums.length < 1)
            return res;
        // 对数组元素进行从小到大排序
        Arrays.sort(nums);
        ArrayList<Integer> list = new ArrayList<Integer>();
        solve(list, nums);
        return res;
    }

    private void solve(ArrayList<Integer> list, int[] nums) {
        if (list.size() == nums.length) {
            for (int i = 0; i < list.size(); i++) {
                System.out.printf("%d ", list.get(i));
            }
            System.out.println();
            // 这一行表示，将list复制一份，存入res
            // 因为后续的操作中还需要list，
            res.add(new ArrayList<Integer>(list));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!list.contains(nums[i])) {
                list.add(nums[i]);
                solve(list, nums);
                list.remove(list.size() - 1);
            }
        }
    }

    public boolean help(ArrayList<Integer> num, int k) {
        int count = 1;
        int max = num.get(0);
        for (int i = 1; i < num.size(); i++) {
            if (num.get(i) > max) {
                count++;
                max = num.get(i);
            }
        }
        return count == k;
    }
}

class FindSumPairs2 {
    int nums1[];
    int nums2[];

    public FindSumPairs2(int[] nums1, int[] nums2) {
        this.nums1 = nums1;
        this.nums2 = nums2;
    }

    public void add(int index, int val) {
        nums2[index] += val;
    }

    public int count(int tot) {
        int count = 0;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] + nums2[j] == tot)
                    count++;
            }
        }
        return count;
    }
}

