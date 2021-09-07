package lc_zhousai_241;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/5/16 10:05 上午
 */
public class T_03 {

}

class FindSumPairs {
    int num1[];
    int num2[];
    Map<Integer, Integer> map = new HashMap<>();

    public FindSumPairs(int[] num1, int[] num2) {
        this.num1 = num1;
        this.num2 = num2;
        for (int i : num2) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
    }

    public void add(int index, int val) {
        map.put(num2[index], map.get(num2[index]) - 1);
        num2[index] += val;
        map.put(num2[index], map.getOrDefault(num2[index], 0) + 1);
    }

    public int count(int tot) {
        int count = 0;
        for (int i : num1) {
            count += map.getOrDefault(tot - i, 0);
        }
        return count;
    }
}