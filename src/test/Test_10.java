package test;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/5/13 9:22 下午
 */
public class Test_10 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;
        return help(root.left, root.right);
    }

    public boolean help(TreeNode left, TreeNode right) {
        if (left == null && right == null)
            return true;
        if (left == null || right == null)
            return false;
        if (left.val != right.val)
            return false;

        return help(left.left, right.right) && help(left.right, right.left);
    }
}
