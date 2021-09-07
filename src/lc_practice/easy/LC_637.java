package lc_practice.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/7/1 10:31 上午
 * 637. 二叉树的层平均值
 */
public class LC_637 {
    List<Double> res = new ArrayList<>();

    public List<Double> averageOfLevels(TreeNode root) {
        bfs(root);
        return res;
    }

    private void bfs(TreeNode root) {
        // 队列
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            double sum = 0.0;
            int size = queue.size();
            // 这个for循环结束，表示这一层结束
            for (int i = 0; i < size; i++) {
                TreeNode cur = queue.poll();
                sum += cur.val;
                if (cur.left != null)
                    queue.offer(cur.left);
                if (cur.right != null)
                    queue.offer(cur.right);
            }
            res.add(sum / size);
        }
    }

    private void dfs(TreeNode root) {
        if (root == null)
            return;
        System.out.println(root.val);
        dfs(root.left);
        dfs(root.right);
    }
}
