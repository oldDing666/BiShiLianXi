package lc_practice.easy;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/6/26 10:10 上午
 * 108. 将有序数组转换为二叉搜索树
 */
public class LC_108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return traverse(nums, 0, nums.length - 1);
    }

    private TreeNode traverse(int[] nums, int l, int r) {
        if (l > r)
            return null;
        int m = l + (r - l) / 2;
        TreeNode root = new TreeNode(nums[m]);
        root.left = traverse(nums, l, m - 1);
        root.right = traverse(nums, m + 1, r);
        return root;
    }
}
