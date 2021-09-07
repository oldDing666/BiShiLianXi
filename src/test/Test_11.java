package test;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/5/13 9:31 下午
 */
public class Test_11 {
    int max = 0;

    public int maxDepth(TreeNode root) {
        help(0, root);
        return max;
    }

    public void help(int depth, TreeNode root) {
        if (root == null)
            return;

        depth += 1;
        help(depth, root.left);
        help(depth, root.right);
        max = Math.max(max, depth);
    }
}
