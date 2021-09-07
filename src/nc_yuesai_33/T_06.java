package nc_yuesai_33;

import java.util.Scanner;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/4/17 8:19 下午
 */
public class T_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            String str0 = sc.nextLine();
            int x = 0, y = 0;
            for (int j = 0; j < n; j++) {
                String str = sc.nextLine();
                String s = str.split(" ")[0];
                int k = Integer.parseInt(str.split(" ")[1]);

                if (s.equals("r")) {
                    int temp = x;
                    x = -y;
                    y = temp;
                } else if (s.equals("l")) {
                    int temp = x;
                    x = y;
                    y = 0 - temp;
                } else if (s.equals("w")) {
                    y += k;
                } else if (s.equals("a")) {
                    x -= k;
                } else if (s.equals("d")) {
                    x += k;
                } else if (s.equals("s")) {
                    y -= k;
                }
            }
            System.out.println(x + " " + y);
        }
    }
}
