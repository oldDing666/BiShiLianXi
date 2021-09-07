package lc_practice.easy;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/6/28 11:49 上午
 * 563. 二叉树的坡度
 */
public class LC_563 {
    int sum = 0;

    public int findTilt(TreeNode root) {
        dfs(root);
        return sum;
    }

    private int dfs(TreeNode root) {
        if (root == null)
            return 0;
//        if (root.left == null && root.right == null)
//            return root.val;
        int left = dfs(root.left);
        int right = dfs(root.right);
        sum += Math.abs(left - right);
        return left + right + root.val;
    }

}
