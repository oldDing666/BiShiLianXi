package lc_practice.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/7/1 5:24 下午
 * 872. 叶子相似的树
 */
public class LC_872 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {1, 2, 3, 4, 5};
        int[] nums3 = {1, 3, 5, 2, 4};
        System.out.println(Arrays.equals(nums1, nums2)); // true
        System.out.println(Arrays.equals(nums1, nums3)); // false
        Arrays.sort(nums3);
        System.out.println(Arrays.equals(nums1, nums3)); // true

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list3 = Arrays.asList(1, 3, 5, 2, 4);
        System.out.println(list1.equals(list2)); // true
        System.out.println(list1.equals(list3)); // false
        Collections.sort(list3);
        System.out.println(list1.equals(list3)); // true
    }


    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        dfs(root1, list1);
        dfs(root2, list2);
        return list1.equals(list2);
    }

    private void dfs(TreeNode root, List<Integer> list) {
        if (root == null)
            return;
        if (root.left == null && root.right == null)
            list.add(root.val);
        dfs(root.left, list);
        dfs(root.right, list);
    }
}
