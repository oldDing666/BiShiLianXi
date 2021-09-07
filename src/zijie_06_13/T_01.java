package zijie_06_13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/6/13 5:39 下午
 */
public class T_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nodes = new int[n];
        for (int i = 0; i < n; i++) {
            nodes[i] = sc.nextInt();
        }
        boolean[] flag = new boolean[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (2 * i + 1 < n && 2 * i + 2 < n &&
                    nodes[i] >= nodes[2 * i + 1] + nodes[2 * i + 2]
                    && !flag[2 * i + 1] && !flag[2 * i + 2]) {
                if (flag[(i - 1) / 2]) {
                } else {
                    sum += nodes[i];
                    flag[i] = true;
                }
            } else if (2 * i + 1 < n && 2 * i + 2 < n &&
                    nodes[i] < nodes[2 * i + 1] + nodes[2 * i + 2]
                    && !flag[2 * i + 1] && !flag[2 * i + 2]
            ) {
                if (flag[i])
                    sum -= nodes[i];
                sum += nodes[2 * i + 1] + nodes[2 * i + 2];
                flag[2 * i + 1] = true;
                flag[2 * i + 2] = true;
            }
        }
        System.out.println(sum);
    }
}
