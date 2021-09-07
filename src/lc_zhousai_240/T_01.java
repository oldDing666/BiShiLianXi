package lc_zhousai_240;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/5/9 9:39 上午
 */
public class T_01 {
    public static void main(String[] args) {
//        int logs[][] = new int[][]{{1993, 1999}, {2000, 2010}};
        int logs[][] = new int[][]{{1950, 1961}, {1960, 1971}, {1970, 1981}};
        System.out.println(new T_01().maximumPopulation(logs));
    }

    public int maximumPopulation(int[][] logs) {
        int len = logs.length;
        Arrays.sort(logs, (e1, e2) -> e1[0] - e2[0]);
        int max = 0;
        int year = logs[0][0];
        for (int i = logs[0][0]; i <= logs[len - 1][0]; i++) {
            int count = 0;
            for (int j = 0; j < len; j++) {
                if (logs[j][0] <= i && i < logs[j][1]) {
                    count++;
                }
            }
            if (max < count) {
                max = count;
                year = i;
            }
        }
        return year;
    }
}
