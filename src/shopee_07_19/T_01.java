package shopee_07_19;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/7/19 2:56 下午
 */
public class T_01 {
    public static void main(String[] args) {
        String source = "abcd";
        String target = "bc";
//        System.out.println(source.substring(3, 4));
        System.out.println(new T_01().findMinOverrideSubString(source, target));
    }

    public String findMinOverrideSubString(String source, String target) {
        // write code here
        int n = source.length();
        int min_substr_len = n + 1;
        String res = "";
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                if (j - i >= min_substr_len)
                    break;
                String str = source.substring(i, j);
//                System.out.println(str);
                if (help(str, target)) {
                    min_substr_len = j - i;
                    res = str;
                }
            }
        }
//        System.out.println(min_substr_len);
        return res;
    }

    private boolean help(String str, String target) {
        char[] s1 = str.toCharArray();
        char[] s2 = target.toCharArray();
        int i = 0, j = 0;
        while (i < s1.length && j < s2.length) {
            if (s1[i] == s2[j]) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return j == s2.length;
    }
}
