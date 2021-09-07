package cestc_08_31;

import java.util.Scanner;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/8/31 7:16 下午
 */
public class T_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        while (sc.hasNext()) {
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        long count0 = 0;
        long count1 = 0;
        long count2 = 0;
        long count3 = 0;
        char ss[] = str.toCharArray();
        for (int i = 0; i < ss.length; i++) {
            char s = ss[i];
            if (s >= '0' && s <= '9')
                count0++;
            else if ((s >= 'a' && s <= 'z') || (s >= 'A' && s <= 'Z'))
                count1++;
            else if (s == ' ')
                count2++;
            else
                count3++;
        }
//            System.out.println("数字：" + count0 + "个，字母：" + count1 + "个，空格：" + count2 + "个，其他：" + count3 + "个");
        System.out.println("数字：" + count0 + "个，字母：" + count1 + "个，空格：" + count2 + "个，其他：" + count3 + "个");
//        }
    }
}
