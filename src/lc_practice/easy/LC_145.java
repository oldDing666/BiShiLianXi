package lc_practice.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/6/26 11:08 上午
 * 145. 二叉树的后序遍历
 */
public class LC_145 {
    List<Integer> res = new ArrayList<>();

    public List<Integer> postorderTraversal(TreeNode root) {
        traverse(root);
        return res;
    }

    private void traverse(TreeNode root) {
        if (root == null)
            return;
        traverse(root.left);
        traverse(root.right);
        res.add(root.val);
    }
}
