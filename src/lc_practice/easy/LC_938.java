package lc_practice.easy;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/7/2 10:56 上午
 * 938. 二叉搜索树的范围和
 */
public class LC_938 {

    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null)
            return 0;
        if (root.val > high)
            return rangeSumBST(root.left, low, high);
        else if (root.val < low)
            return rangeSumBST(root.right, low, high);
        return root.val + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
    }


}
