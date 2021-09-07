package lc_practice.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/7/1 11:37 上午
 * 653. 两数之和 IV - 输入 BST
 */
public class LC_653 {
    Set<Integer> set = new HashSet<>();

    public boolean findTarget(TreeNode root, int k) {
        return dfs(root, k);
    }

    private boolean dfs(TreeNode root, int k) {
        if (root == null)
            return false;
        if (set.contains(k - root.val))
            return true;
        set.add(root.val);
        return dfs(root.left, k) || dfs(root.right, k);
    }
}
