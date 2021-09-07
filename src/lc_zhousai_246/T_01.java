package lc_zhousai_246;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/6/20 10:30 上午
 */
public class T_01 {
    public static void main(String[] args) {
        String num = "52";
        System.out.println(largestOddNumber(num));
    }

    public static String largestOddNumber(String num) {
        for (int i = num.length() - 1; i >= 0; i--) {
            int n = num.charAt(i) - '0';
            if (n % 2 == 1)
                return num.substring(0, i + 1);
        }
        return "";
    }
}
