package cvte_08_06;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/8/6 7:48 下午
 */
public class T_02 {
    public static void main(String[] args) {
        int a = 'a';
        System.out.println(a);
    }

    public static String[] PrintMinNumber(String[] strs) {
        for (int i = 0; i <= strs.length - 1; i++) {
            for (int j = 1; j <= strs.length - 1 - i; j++) {
                if (Compare(strs[j - 1], strs[j])) {
                    String temp = strs[j - 1];
                    strs[j - 1] = strs[j];
                    strs[j] = temp;
                }
            }
        }
        return strs;
    }

    public static boolean Compare(String s1, String s2) {
        int num1 = 0;
        int num2 = 0;
        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            if ((c1 >= 'a' && c1 <= 'z') || (c1 >= 'A' && c1 <= 'Z')) {
                num1 += c1;
            }
        }
        for (int i = 0; i < s2.length(); i++) {
            char c2 = s1.charAt(i);
            if ((c2 >= 'a' && c2 <= 'z') || (c2 >= 'A' && c2 <= 'Z')) {
                num1 += c2;
            }
        }
        return num1 >= num2;
    }
}
