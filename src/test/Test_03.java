package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/4/18 11:04 上午
 */
public class Test_03 {
    public static void main(String[] args) {
        List<int[]> list = new ArrayList<>();
        int a1[] = new int[]{1, 2, 3};
        int a2[] = new int[]{4, 5};
        int a3[] = new int[]{6};
        list.add(a1);
        list.add(a2);
        list.add(a3);
        for (int temp[] : list) {
            System.out.println(Arrays.toString(temp));
        }
        // list.toArray(new int[0][])中下标的取值范围是[0,list.size]闭区间
        int a4[][] = list.toArray(new int[0][]);
        for (int i = 0; i < a4.length; i++) {
            System.out.println(a4[i].length);
            System.out.println(Arrays.toString(a4[i]));
        }
    }
}
