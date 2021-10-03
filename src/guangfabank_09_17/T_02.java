package guangfabank_09_17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/9/17 8:16 下午
 */
public class T_02 {
    public int countMagics(ArrayList<Integer> arrayA, ArrayList<Integer> arrayB) {
        // write code here
        int[] arr1 = new int[arrayA.size()];
        int[] arr2 = new int[arrayB.size()];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arrayA.get(i);
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arrayB.get(i);
        }
        return help(arr1, arr2);
    }

    private int help(int[] arr1, int[] arr2) {
        double sum1 = 0;
        for (int i : arr1) {
            sum1 += i;
        }

        double sum2 = 0;
        for (int i : arr2) {
            sum2 += i;
        }

        if (sum1/arr1.length == sum2/arr2.length){
            return 0;
        }
        int [] arrMore = null;
        int [] arrless = null;
        double sumMore = 0;
        double sumLess = 0;
        if (sum1/arr1.length>sum2/arr2.length){
            arrMore = arr1;
            arrless = arr2;
            sumMore = sum1;
            sumLess = sum2;
        }else {
            arrMore = arr2;
            arrless = arr1;
            sumMore = sum2;
            sumLess = sum1;
        }
        Arrays.sort(arrMore);
        HashSet<Integer> set = new HashSet<>();
        for (int num : arrless) {
            set.add(num);
        }

        int moreSize = arrMore.length;
        int lessSize = arrless.length;
        int res = 0;
        for (int i = 0; i < arrMore.length; i++) {
            if (arrMore[i]<sumMore/moreSize
                    && arrMore[i]>sumLess/lessSize
            && !set.contains(arrMore[i])){
                sumMore -= arrMore[i];
                sumLess += arrMore[i];
                moreSize--;
                lessSize++;
                set.add(arrMore[i]);
                res++;
            }
        }
        return res;
    }
}
