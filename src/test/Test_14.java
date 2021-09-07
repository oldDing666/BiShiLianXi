package test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/5/14 4:05 下午
 */
public class Test_14 {
    public static void main(String[] args) {
        String str = "\r\n";
        System.out.println(str.length());
        String ss[] = str.split("[ \r\f\n\t]");
        System.out.println(ss.length);

        for (String s : ss) {
            System.out.println(s);
        }
    }
}
