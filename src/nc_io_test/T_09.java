package nc_io_test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/8/25 2:45 下午
 */
public class T_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
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
}
