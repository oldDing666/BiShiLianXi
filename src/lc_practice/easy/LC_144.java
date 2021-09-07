package lc_practice.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/6/26 11:02 上午
 * 144. 二叉树的前序遍历
 */
public class LC_144 {

    List<Integer> res = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        traverse(root);
        return res;
    }

    private void traverse(TreeNode root) {
        if (root == null)
            return;
        res.add(root.val);
        traverse(root.left);
        traverse(root.right);
    }
}
