package cestc_08_14;

import java.util.Scanner;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/8/14 3:16 下午
 */
public class T_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String str = sc.next();
            str = str.substring(2);
            System.out.println(Integer.valueOf(str, 16));

        }
    }
}
