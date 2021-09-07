package lc_practice.easy;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/6/26 11:11 上午
 * 235. 二叉搜索树的最近公共祖先
 */
public class LC_235 {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        if (traverse(root.left, p) && traverse(root.left, q))
//            return lowestCommonAncestor(root.left, p, q);
//        else if (traverse(root.right, p) && traverse(root.right, q))
//            return lowestCommonAncestor(root.right, p, q);
//        return root;

        if (p.val < root.val && q.val < root.val)
            return lowestCommonAncestor(root.left, p, q);
        else if (p.val > root.val && q.val > root.val)
            return lowestCommonAncestor(root.right, p, q);
        return root;
    }

    private boolean traverse(TreeNode root, TreeNode node) {
        if (root == null)
            return false;
        if (root.val == node.val)
            return true;
        if (root.val < node.val)
            return traverse(root.right, node);
        return traverse(root.left, node);
    }
}
