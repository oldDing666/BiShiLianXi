package nc_io_test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/8/25 2:34 下午
 */
public class T_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n_str = sc.nextLine();
        int n = Integer.parseInt(n_str);
        String str = sc.nextLine();
        String s[] = str.split(" ");
        Arrays.sort(s);
        for (int i = 0; i < s.length; i++) {
            if (i == s.length - 1) {
                System.out.println(s[i]);
            } else {
                System.out.printf("%s ", s[i]);
            }
        }
    }
}
