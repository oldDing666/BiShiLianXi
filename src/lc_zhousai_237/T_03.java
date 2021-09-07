package lc_zhousai_237;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/4/18 10:19 上午
 */
public class T_03 {
    public int[] getOrder(int[][] tasks) {
        int list1[] = new int[tasks.length];


        Arrays.sort(tasks, (e1, e2) -> e1[0] - e2[0]);
        Queue<Integer> in = new LinkedList<>();
        int list2[] = new int[tasks.length];
        int res[] = new int[tasks.length];
        res[0] = 0;
        in.add(tasks[0][0]);
        list2[0] = tasks[0][1];
        for (int i = 1; i < tasks.length; i++) {

        }
        return res;
    }
}
