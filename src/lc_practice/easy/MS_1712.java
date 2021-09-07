package lc_practice.easy;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/7/5 10:53 上午
 * 面试题 17.12. BiNode
 */
public class MS_1712 {
    TreeNode pre = null;
    TreeNode res = null;

    public TreeNode convertBiNode(TreeNode root) {
        dfs(root);
        return res;
    }

    private void dfs(TreeNode root) {
        if (root == null)
            return;

        dfs(root.left);
        if (pre == null) {
            pre = root;
            res = root;
        } else {
            root.left = null;
            pre.right = root;
            pre = root;
        }
        dfs(root.right);
    }
}
