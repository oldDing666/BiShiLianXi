package lc_practice.easy;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/6/26 10:36 上午
 * 112. 路径总和
 */
public class LC_112 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null)
            return false;
        targetSum = targetSum - root.val;
        if (targetSum == 0 && root.left == null && root.right == null)
            return true;
        return hasPathSum(root.left, targetSum) || hasPathSum(root.right, targetSum);
    }
}
