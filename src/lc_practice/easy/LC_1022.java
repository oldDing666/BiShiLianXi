package lc_practice.easy;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/7/2 3:21 下午
 * 1022. 从根到叶的二进制数之和
 */
public class LC_1022 {

    int sum = 0;

    public int sumRootToLeaf(TreeNode root) {
        dfs(root, 0);
        return sum;
    }

    private void dfs(TreeNode root, int cur) {
        if (root == null)
            return;
        // cur<<1 表示左移一位，不能使用+=
        cur = (cur << 1) + root.val;
        // 叶子节点，表示这条路径结束，加入最终的和中
        if (root.left == null && root.right == null) {
            sum += cur;
            return;
        }
        dfs(root.left, cur);
        dfs(root.right, cur);
    }


}
