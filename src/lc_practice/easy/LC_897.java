package lc_practice.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/7/2 10:28 上午
 * 897. 递增顺序搜索树
 */
public class LC_897 {
    List<TreeNode> nodes = new ArrayList<>();

    public TreeNode increasingBST(TreeNode root) {
        dfs(root);
        TreeNode head = new TreeNode(nodes.get(0).val);
        root = head;
        for (int i = 1; i < nodes.size(); i++) {
            head.left = null;
            head.right = new TreeNode(nodes.get(i).val);
            head = head.right;
        }
        return root;
    }

    private void dfs(TreeNode root) {
        if (root == null)
            return;
        dfs(root.left);
        nodes.add(root);
        dfs(root.right);
    }
}
