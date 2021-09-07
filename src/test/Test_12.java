package test;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/5/13 9:40 下午
 */
public class Test_12 {
    int max = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        depht(root);
        return max;
    }

    public int depht(TreeNode root) {
        if (root == null)
            return 0;
        // 左右子树的最大深度
        int left = depht(root.left);
        int right = depht(root.right);
        max = Math.max(max, left + right);
        return Math.max(left, right) + 1;
    }
}
