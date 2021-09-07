package test;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/5/24 10:15 上午
 */
public class Test_16 {
    public static void main(String[] args) {
        int n = 10;
//        help(10);
        for (int i = 0; i < 10; i++) {
            System.out.println(help2(i));
        }
    }

    private static double help(int n) {
        if (n == 0)
            return 3;
        double a[] = new double[n];
        a[0] = 3;
        for (int i = 1; i < n; i++) {
            a[i] = a[i - 1] - (a[i - 1] * Math.pow(Math.E, a[i - 1]) - 100) / ((a[i - 1] + 1) * Math.pow(Math.E, a[i - 1]));
            System.out.println(a[i]);
        }
        return a[n - 1];
    }

    private static double help2(int n) {
        if (n == 0)
            return 3;
        return help2(n - 1) - (help2(n - 1) * Math.pow(Math.E, help2(n - 1)) - 100) / ((help2(n - 1) + 1) * Math.pow(Math.E, help2(n - 1)));
    }
}
