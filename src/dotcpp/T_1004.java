package dotcpp;

import java.util.Scanner;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/6/3 9:31 上午
 */
public class T_1004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            if (n == 0)
                break;
            System.out.println(help(n));
        }
    }

    private static int help(int n) {
        if (n == 1)
            return 1;
        else if (n == 2)
            return 2;
        else if (n == 3)
            return 3;
        else if (n == 4)
            return 4;
        else
            return help(n - 1) + help(n - 3);
    }
}
