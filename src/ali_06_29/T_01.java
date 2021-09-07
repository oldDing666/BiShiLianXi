package ali_06_29;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/6/29 7:12 下午
 */
public class T_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int t1 = sc.nextInt();
        int t2 = sc.nextInt();
        int p = sc.nextInt();
        int d = sc.nextInt();

        int[] temp = {s, x1, x2};
        Arrays.sort(temp);
//        int num = (temp[1] + temp[2]) / 2;
        int num = temp[1];
        System.out.println((num - x1)*t2);
    }
}
