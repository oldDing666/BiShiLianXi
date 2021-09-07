package lc_zhousai_239;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/5/2 9:36 上午
 */
public class T_04 {
    public static void main(String[] args) {
        int intervals[][] = {{4, 5}, {5, 8}, {1, 9}, {8, 10}, {1, 6}};
        int queries[] = {7, 9, 3, 9, 3};
        System.out.println(Arrays.toString(new T_04().minInterval(intervals, queries)));
    }

    public int[] minInterval(int[][] intervals, int[] queries) {
        int res[] = new int[queries.length];
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        for (int i = 0; i < queries.length; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < intervals.length; j++) {
                if (intervals[j][0] > queries[i])
                    break;
                if (intervals[j][1] < queries[i])
                    continue;
                min = Math.min(min, intervals[j][1] - intervals[j][0] + 1);
            }
            res[i] = min == Integer.MAX_VALUE ? -1 : min;
        }

//        int j = 0;
//        for (int i = 0; i < intervals.length; i++) {
//            if (intervals[i][0] > queries[j])
//                continue;
//            if (intervals[i][1] < queries[j])
//                continue;
//
//        }
        return res;
    }
}
