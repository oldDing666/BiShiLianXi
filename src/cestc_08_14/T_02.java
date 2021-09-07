package cestc_08_14;

import java.util.Scanner;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/8/14 3:25 下午
 */
public class T_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            System.out.println("返回内容为："+str + "是一个" + str.length() + "位数。");
            System.out.println("按逆序输出是：" + new StringBuilder(str).reverse().toString());
        }
    }
}
