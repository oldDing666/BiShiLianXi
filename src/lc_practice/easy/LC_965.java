package lc_practice.easy;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/7/2 11:10 上午
 * 965. 单值二叉树
 */
public class LC_965 {
    public boolean isUnivalTree(TreeNode root) {
        if (root == null)
            return true;
        if (root.left != null && root.val != root.left.val)
            return false;
        if (root.right != null && root.val != root.right.val)
            return false;
        return isUnivalTree(root.left) && isUnivalTree(root.right);
    }
}
