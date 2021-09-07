package lc_practice.easy;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/7/2 4:48 下午
 */
public class MS_0402 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return dfs(nums, 0, nums.length - 1);
    }

    private TreeNode dfs(int[] nums, int l, int r) {
        if (l > r)
            return null;
        if (l == r)
            return new TreeNode(nums[l]);
        int mid = (l + r) / 2;
        TreeNode cur = new TreeNode(nums[mid]);
        cur.left = dfs(nums, l, mid - 1);
        cur.right = dfs(nums, mid + 1, r);
        return cur;
    }
}
