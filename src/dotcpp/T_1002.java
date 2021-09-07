package dotcpp;

import java.util.Scanner;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/6/3 9:39 上午
 */
public class T_1002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int max = Math.max(a, b);
            max = Math.max(max, c);
            System.out.println(max);
        }
    }
}
