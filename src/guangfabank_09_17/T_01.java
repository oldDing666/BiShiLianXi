package guangfabank_09_17;

import java.util.Arrays;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/9/17 6:39 下午
 */
public class T_01 {
    public static void main(String[] args) {
//        ["abcd","def"],"cbd"
        String[] strs = {"abcd","def"};
        String srcStr = "cbd";
//        String[] strs = {"abc",""};
//        String srcStr = "";
        System.out.println(new T_01().countAnagrams(strs,srcStr));
    }
    public int countAnagrams(String[] strs, String srcStr) {
        // write code here
        int count = 0;
        if (srcStr.equals("")){
            for (int i = 0; i < strs.length; i++) {
                if (strs[i].equals(""))
                    count++;
            }
            return count;
        }
        for (int i = 0; i < strs.length; i++) {
            if (help(strs[i], srcStr)) {
                count++;
            }
        }
        return count;
    }

    private boolean help(String str, String srcStr) {
        int n = srcStr.length();
        for (int i = 0; i <= str.length() - n; i++) {
            String s = str.substring(i, i + n);
//            System.out.println(s);
            if (help2(s,srcStr))
                return true;
        }
        return false;
    }

    private boolean help2(String s, String srcStr) {
        char[] s1 = s.toCharArray();
        char[] s2 = srcStr.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        String ss1 = String.valueOf(s1);
        String ss2 = String.valueOf(s2);
        return ss1.equals(ss2);
    }
}
