package lc_practice.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/6/26 11:44 上午
 * 257. 二叉树的所有路径
 */
public class LC_257 {
    List<String> res = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        // 注意，后面这个参数不能直接使用StringBuilder类型。
        // 使用String类型，是因为其是不可变的。
        // 当有变化时，都会生成一个新的String类型变量
        traverse(root, "");
        return res;
    }

    private void traverse(TreeNode root, String str) {
        if (root == null)
            return;
        // 这里使用StringBuilder是因为拼接的效率比String类型高
        StringBuilder sb = new StringBuilder(str);
        if (root.left == null && root.right == null) {
            sb.append(root.val);
            res.add(sb.toString());
            return;
        }
        sb.append(root.val);
        sb.append("->");
        traverse(root.left, sb.toString());
        traverse(root.right, sb.toString());
    }
}
