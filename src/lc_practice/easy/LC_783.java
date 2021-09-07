package lc_practice.easy;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/7/1 4:18 下午
 */

public class LC_783 {
    int min = Integer.MAX_VALUE;
    TreeNode pre = null;

    public int minDiffInBST(TreeNode root) {
        dfs(root);
        return min;
    }

    private void dfs(TreeNode root) {
        if (root == null)
            return;
        dfs(root.left);
        if (pre == null)
            pre = root;
        else {
            min = Math.min(min, root.val - pre.val);
            pre = root;
        }
        dfs(root.right);
    }
}
