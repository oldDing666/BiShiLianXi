package test;

import java.util.regex.Pattern;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/5/26 3:47 下午
 */
public class Test_23 {
    public static void main(String[] args) {
        String p = "^\\+861[^0][0-9]{9}";
        String nums = "+8612332322323";
        System.out.println(Pattern.matches(p, nums));
    }
}
