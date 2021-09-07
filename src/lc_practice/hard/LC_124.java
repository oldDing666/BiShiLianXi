package lc_practice.hard;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/7/5 11:26 上午
 * 124. 二叉树中的最大路径和
 */
public class LC_124 {
    int res = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        dfs(root);
        return res;
    }

    private int dfs(TreeNode root) {
        if (root == null)
            return 0;
        // 左子树最大的路径和，去掉比0小的
        int leftMax = Math.max(dfs(root.left), 0);
        // 右子树最大的路径和，去掉比0小的
        int rightMax = Math.max(dfs(root.right), 0);
        // 以当前节点为根节点，计算全局的最大路径和
        res = Math.max(res, root.val + leftMax + rightMax);
        // 把root当作一个子树
        return root.val + Math.max(leftMax, rightMax);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}