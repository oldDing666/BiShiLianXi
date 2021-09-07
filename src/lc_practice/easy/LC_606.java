package lc_practice.easy;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/7/1 9:36 上午
 * 606. 根据二叉树创建字符串
 */
public class LC_606 {

    StringBuilder sb = new StringBuilder();

    public String tree2str(TreeNode root) {
        dfs(root);
        return sb.toString();
    }

    private void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        sb.append(root.val);
        if (root.left == null && root.right == null)
            return;
        sb.append("(");
        dfs(root.left);
        sb.append(")");
        if (root.left != null && root.right == null)
            return;
        sb.append("(");
        dfs(root.right);
        sb.append(")");
    }
}
