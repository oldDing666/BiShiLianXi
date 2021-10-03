package JZOffer_v1;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/9/28 4:13 下午
 */
public class T_17 {
    public static void main(String[] args) {
//        printNumbers(3);
    }

    public static int[] printNumbers(int n) {
        int num = 0;
        for (int i = 0; i < n; i++) {
            num += 9 * Math.pow(10, i);
        }
        int res[] = new int[num];
        for (int i = 0; i < num; i++) {
            res[i] = i + 1;
        }
        return res;
    }
}
