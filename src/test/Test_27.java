package test;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/6/7 10:10 下午
 */
public class Test_27 {
    public static void main(String[] args) {
        int x = 2, y = 5;
        System.out.println(ksm(x, y));
    }

    private static int ksm(int x, int y) {
        int res = 1;
        while (y > 0) {
            if (y % 2 == 1) {
                res = res * x;
            }
            x = x * x;
            y = y >> 1;
        }
        return res;
    }
}
