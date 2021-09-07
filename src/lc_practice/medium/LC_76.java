package lc_practice.medium;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/9/3 5:31 下午
 */
public class LC_76 {
    public static void main(String[] args) {
        int nums[] = {3,2,3,1,2,4,5,5,6};
        int k = 4;
        System.out.println(findKthLargest(nums,k));
    }

    public static int findKthLargest(int[] nums, int k) {
        Queue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            queue.offer(nums[i]);
        }

        for (int i = k; i < nums.length; i++) {
            queue.offer(nums[i]);
            queue.poll();
        }
        return queue.peek();
    }
}
