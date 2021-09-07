package dotcpp;

import java.util.Scanner;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/6/3 9:36 上午
 */
public class T_1005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            double f = scanner.nextDouble();
            System.out.printf("c=%.2f", 5 * (f - 32) / 9.0);
        }
    }
}
