package qushi_08_21;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/8/21 7:54 下午
 */
public class T_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
//        System.out.println(str);
        String matchStr = str.split(" ")[0];
//        System.out.println("matchStr: " + matchStr);
        String str2 = str.substring(matchStr.length() + 1, str.length()).trim();
        str2 = str2.substring(1, str2.length() - 1);
        String strs1[] = str2.split(",");
        String strs[] = new String[strs1.length];
        int index = 0;
        for (String s : strs1) {
            s = s.trim();
            s = s.substring(1, s.length() - 1);
            strs[index] = new String(s);
            index++;
        }
        System.out.println(help(matchStr, strs));
    }

    private static String help(String matchStr, String[] strs) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strs.length; i++) {
            if (help2(matchStr, strs[i])) {
                sb.append(strs[i]);
                sb.append(" ");
            }
        }
        String res = sb.toString();
        if (res.length() == 0)
            return "Not Match";
        res = res.substring(0, res.length() - 1);
        return res;
    }

    private static boolean help2(String matchStr, String str) {
        if (matchStr.equals("*"))
            return true;
        if (matchStr.startsWith("*")) {
            return Pattern.matches(matchStr, str);
        }
        String strs1[] = matchStr.split("\\.");
        String strs2[] = str.split("\\.");
        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < strs1.length; i++) {
            if (strs1[i].equals("*")) {
                index2++;
                continue;
            }
            if (strs1[i].equals(strs2[index2])) {
                index2++;
            } else {
                return false;
            }
        }
        return index2 >= strs2.length;
    }
}
