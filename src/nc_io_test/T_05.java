package nc_io_test;

import java.util.Scanner;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/8/25 2:27 下午
 */
public class T_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        int n = Integer.parseInt(str1);
        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            String s[] = str.split(" ");
            int sum = 0;
            for (int j = 1; j < s.length; j++) {
                sum += Integer.parseInt(s[j]);
            }
            System.out.println(sum);
        }
    }
}