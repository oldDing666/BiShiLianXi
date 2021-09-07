package lc_practice.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/6/28 10:24 上午
 */
public class LC_501 {
    public int[] findMode(TreeNode root) {
        dfs(root);
        // list集合类型不能直接转成一维基本类型数组
        int[] arr = new int[nodes.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = nodes.get(i);
        }
        return arr;
    }

    List<Integer> nodes = new ArrayList<>();
    TreeNode pre = null;
    int count = 0;
    int maxcount = 0;

    private void dfs(TreeNode root) {
        if (root == null)
            return;
        dfs(root.left);
        // 中序遍历后，得到一个非递减的list集合，求这个集合中众数的集合

        // 要注意处理第一个节点的方式
        // pre表示上一个节点，root表示当前节点
        if (pre == null) {
            count = 1;
            pre = root;
        } else if (pre.val == root.val) {
            count++;
        } else if (root.val > pre.val) {
            pre = root;
            count = 1;
        }

        if (count > maxcount) {
            nodes.clear();
            nodes.add(root.val);
            maxcount = count;
        } else if (count == maxcount) {
            nodes.add(root.val);
        }

        dfs(root.right);
    }
}
