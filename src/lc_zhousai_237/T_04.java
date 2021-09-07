package lc_zhousai_237;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/4/18 10:19 上午
 */
public class T_04 {
    public int getXORSum(int[] arr1, int[] arr2) {
        int res = 0;
        for (int i = 0; i < arr1.length; i++) {
            res ^= arr1[i];
        }
        int res2 = 0;
        for (int i = 0; i < arr2.length; i++) {
            res2 ^= arr2[i];
        }
        return res & res2;
    }
}
