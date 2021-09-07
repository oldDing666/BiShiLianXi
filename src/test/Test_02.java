package test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/4/18 10:43 上午
 */
public class Test_02 {
    

    public static void main(String[] args) {
//        int a[] = new int[]{5};
//        int res = 0;
//        for (int i = 0; i <a.length; i++) {
//            res ^= a[i];
//        }
//        System.out.println(res);

//        int a1[] = new int[]{1, 2, 3};
//        int a2[] = new int[]{6, 5};
//        for (int i = 0; i < a1.length; i++) {
//            for (int j = 0; j < a2.length; j++) {
//                System.out.println(a1[i] & a2[j]);
//            }
//        }

        Set<String> set = new HashSet<>();
        int a1[] = new int[]{12};
        int a2[] = new int[]{4};
        int res = 0;
        for (int i = 0; i < a1.length; i++) {
            res ^= a1[i];
        }
        int res2 = 0;
        for (int i = 0; i < a2.length; i++) {
            res2 ^= a2[i];
        }
        System.out.println(res & res2);

        String s = "abc";
        System.out.println();
        System.out.println("s = " + s);
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("Test_02.main");
//        ifn | s.null
        if (s == null) {

        }
        // inn | s.nn
        if (s != null) {
            
        }

        List<Integer> list = Arrays.asList(1, 3, 5, 2, 4);
        // iter
        for (Integer integer : list) {
            
        }
        
        // list.for
        for (Integer integer : list) {

        }
        // list.fori
        for (int i = 0; i < list.size(); i++) {

        }
        // list.forr
        for (int i = list.size() - 1; i >= 0; i--) {

        }

//        System.out.println(getXORSum(a1, a2));
    }

    public static int getXORSum(int[] arr1, int[] arr2) {
        int res = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                res ^= (arr1[i] & arr2[j]);
            }
        }
        return res;
    }
}
