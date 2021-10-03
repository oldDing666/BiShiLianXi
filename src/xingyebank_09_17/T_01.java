package xingyebank_09_17;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/9/17 9:07 上午
 */
public class T_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strs = str.split(" ");
        Arrays.sort(strs);
        for (int i = 0; i < strs.length-1; i++) {
            System.out.printf("%s ", strs[i]);
        }
        System.out.println(strs[strs.length-1]);
    }
}
