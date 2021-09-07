package ali_06_04;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/6/4 8:58 上午
 */
public class T_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        Arrays.sort(nums);
        int min = Math.min(n1, n2);
        int max = Math.max(n1, n2);
        int count1 = 0, count2 = 0;
        for (int i = n - 1; i >= n - min; i--) {
            count1 += nums[i];
        }
        for (int i = n - min - 1; i >= n - min - max; i--) {
            count2 += nums[i];
        }
        System.out.printf("%.6f\n", count1 / (min * 1.0) + count2 / (max * 1.0));
    }
}
