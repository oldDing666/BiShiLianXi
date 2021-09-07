package lc_practice.easy;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/6/28 3:03 下午
 * 671. 二叉树中第二小的节点
 */
public class LC_671 {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
    }

    int min;

    public int findSecondMinimumValue(TreeNode root) {
        // 最小值就是root的值
        min = root.val;
        return dfs(root);
    }

    // 这个方法是寻找root树中，比min大的，最小的值
    private int dfs(TreeNode root) {
        if (root == null)
            return -1;
        // 寻找第一个比root大的值就行了，使用了题目信息，根节点<=左，右子结点
        if (root.val > min) {
            return root.val;
        }
        int left = dfs(root.left);
        int right = dfs(root.right);
        // 这里题目申明了，子节点要么没有，要么有两个
        if (left == -1)
            return right;
        if (right == -1)
            return left;
        return Math.min(left, right);
    }
}
