package test;

import java.util.Arrays;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/5/26 6:37 下午
 */
public class Test_26 {
    public static void main(String[] args) {

    }

    public String[] help(String str[]) {
        for (String s : str) {
            switch (s) {
                case "A":
                    s = "1";
                    break;
                case "J":
                    s = "11";
                    break;
                case "Q":
                    s = "12";
                    break;
                case "K":
                    s = "13";
                    break;
            }
        }
        Arrays.sort(str);
        for (String s : str) {
            switch (s) {
                case "1":
                    s = "A";
                    break;
                case "11":
                    s = "J";
                    break;
                case "12":
                    s = "Q";
                    break;
                case "13":
                    s = "K";
                    break;
            }
        }
        return str;
    }
}
