package nc_io_test;

import java.util.Scanner;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/8/25 11:40 上午
 */
public class T_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            if (str.equals("0"))
                break;
            String s[] = str.split(" ");
            int sum = 0;
            for (int i = 1; i < s.length; i++) {
                sum += Integer.parseInt(s[i]);
            }
            System.out.println(sum);
        }
    }
}
