package lc_practice.easy;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/6/28 10:10 上午
 * 404. 左叶子之和
 */
public class LC_404 {
    int sum = 0;

    public int sumOfLeftLeaves(TreeNode root) {
        dfs(root);
        return sum;
    }

    private void dfs(TreeNode root) {
        if (root == null)
            return;
        if (root.left != null && root.left.left == null && root.left.right == null) {
            sum += root.left.val;
        }
        dfs(root.left);
        dfs(root.right);
    }
}
