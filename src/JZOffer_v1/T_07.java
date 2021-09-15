package JZOffer_v1;

import java.util.Arrays;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/9/15 3:51 下午
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class T_07 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0 || inorder.length == 0)
            return null;
        int root_val = preorder[0];
        TreeNode root = new TreeNode(root_val);
        int index = 0;
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == root_val) {
                index = i;
                break;
            }
        }
        int[] in_left = new int[index];
        int[] pre_left = new int[in_left.length];
        System.arraycopy(preorder, 1, pre_left, 0, pre_left.length);
        System.arraycopy(inorder, 0, in_left, 0, in_left.length);
        int[] in_right = new int[inorder.length - 1 - in_left.length];
        int[] pre_right = new int[in_right.length];
        System.arraycopy(preorder, in_left.length + 1, pre_right, 0, pre_right.length);
        System.arraycopy(inorder, index + 1, in_right, 0, in_right.length);
        root.left = buildTree(pre_left, in_left);
        root.right = buildTree(pre_right, in_right);

        return root;
    }
}
