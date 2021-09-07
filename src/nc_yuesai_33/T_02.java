package nc_yuesai_33;

import java.util.Scanner;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/4/17 7:11 下午
 */
public class T_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
//        int test[][] = new int[t][2];
        for (int i = 0; i < t; i++) {
//            test[i][0] = sc.nextInt();
//            test[i][1] = sc.nextInt();
            int p = sc.nextInt();
            int q = sc.nextInt();
            System.out.println(p_q_toString(p, q));
        }

    }

    private static String p_q_toString(int p, int q) {
        int n1 = p / q;
        int n2 = p % q;
        while (n2 != 0) {

        }
        return null;
    }
}
