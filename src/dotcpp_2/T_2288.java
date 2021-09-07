package dotcpp_2;

import java.util.Scanner;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/6/5 2:48 下午
 */
public class T_2288 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int index = 0;
        for (int i = 2; i <= n; i++) {
            index = (index + k) % i;
        }
        System.out.println(index + 1);
    }
}
