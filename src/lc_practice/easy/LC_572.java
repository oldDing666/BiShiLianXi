package lc_practice.easy;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/7/1 9:14 上午
 * 572. 另一个树的子树
 */
public class LC_572 {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null)
            return false;
        return dfs(root, subRoot) || isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    private boolean dfs(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null)
            return true;
        if (root == null || subRoot == null || root.val != subRoot.val)
            return false;
        return dfs(root.left, subRoot.left) && dfs(root.right, subRoot.right);
    }
}
