package lc_practice.easy;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/7/2 11:18 上午
 * 993. 二叉树的堂兄弟节点
 */
public class LC_993 {
    int x, y;
    int x_deep = 0;
    int y_deep = 0;
    TreeNode x_farther = null;
    TreeNode y_farther = null;

    public boolean isCousins(TreeNode root, int x, int y) {
        this.x = x;
        this.y = y;
        dfs(root, 0, null);
        return x_deep == y_deep && x_farther != y_farther;
    }

    private void dfs(TreeNode root, int deep, TreeNode parent) {
        if (root == null)
            return;

        if (root.val == x) {
            x_deep = deep;
            x_farther = parent;
        } else if (root.val == y) {
            y_deep = deep;
            y_farther = parent;
        }
        dfs(root.left, deep + 1, root);
        dfs(root.right, deep + 1, root);
    }
}
