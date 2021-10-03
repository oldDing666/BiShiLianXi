package JZOffer_v1;

import javafx.scene.transform.Rotate;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/9/25 10:21 上午
 */
public class T_27 {
    public TreeNode mirrorTree(TreeNode root) {
        if (root == null)
            return root;
        TreeNode left = root.left;
        TreeNode right = root.right;
        root.right = mirrorTree(left);
        root.left = mirrorTree(right);
        return root;
    }
}
