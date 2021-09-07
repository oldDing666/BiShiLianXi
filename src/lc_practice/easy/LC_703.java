package lc_practice.easy;

import java.util.*;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/7/1 3:35 下午
 */
public class LC_703 {

}

class KthLargest {
    Queue<Integer> queue;
    int k;

    public KthLargest(int k, int[] nums) {
        queue = new PriorityQueue<>();
        this.k = k;
        for (int num : nums) {
            add(num);
        }
    }

    public int add(int val) {
        queue.offer(val);
        if (queue.size() > k)
            queue.poll();
        return queue.peek();
    }
}