package dotcpp_2;

import java.util.Scanner;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/6/5 3:05 下午
 */
public class T_1795 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String ss = sc.nextLine();
        while (t > 0) {
            String str = sc.nextLine();
            int year = Integer.parseInt(str.split("-")[0]);
            int month = Integer.parseInt(str.split("-")[1]);
            int day = Integer.parseInt(str.split("-")[2]);
            int temp = 0;
            while (true) {
                if (month <= 2 && day <= 28) {
                    temp += help(year) ? 366 : 365;
                    if (temp % 7 == 0) {
                        System.out.println(year + 1);
                        break;
                    }
                    year++;
                } else if (month == 2 && day == 29) {
                    temp += help(year + 1) ? 366 : 365;
                    if (temp % 7 == 0 && help(year + 1)) {
                        System.out.println(year + 1);
                        break;
                    }
                    year++;
                } else {
                    temp += help(year + 1) ? 366 : 365;
                    if (temp % 7 == 0) {
                        System.out.println(year + 1);
                        break;
                    }
                    year++;
                }
            }
            t--;
        }
    }

    private static boolean help(int year) {
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
            return true;
        return false;
    }


}
