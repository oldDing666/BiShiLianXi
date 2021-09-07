package nc_yuesai_33;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/4/17 7:02 下午
 */
public class T_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str0 = sc.nextLine();
        for (int i = 0; i < n; i++) {
            int n1 = 0, n2 = 0, n3 = 0;
            while (sc.hasNext()) {
                n1++;
                String str = sc.nextLine();
                if (str.equals("=====")) {
                    System.out.println(--n1 + " " + n2 + " " + n3);
                    break;
                } else {
                    n3 += str.length();
                    str = str.trim();
                    n2 += str.split(" ").length;
                }
            }
        }
    }
}
