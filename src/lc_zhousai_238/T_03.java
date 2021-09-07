package lc_zhousai_238;

import java.util.*;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/4/25 10:23 上午
 */
public class T_03 {
    public static void main(String[] args) {
        System.out.println(new T_03().longestBeautifulSubstring("aeeeiiiioooauuuaeiou"));
    }

    public int longestBeautifulSubstring(String word) {
        if (word.length() < 5)
            return 0;
        int max = 0;
        int temp = 0;
        for (int i = 0; i <= word.length() - 5; i++) {
            if (word.charAt(i) == word.charAt(i + 1)) {
                i++;
                temp++;
                continue;
            }
            for (int j = i + 5; j <= word.length(); j++) {
                if (j + 1 < word.length() && word.charAt(j) == word.charAt(j + 1)) {
                    j++;
                    continue;
                }
                String str = word.substring(i - temp, j);
                if (help(str))
                    max = Math.max(max, j - i + temp);
            }
        }
        return max;

//        if (word.length() < 5)
//            return 0;
//        int max = 0;
//        int left = 0, right = 0;
//        int len = 0;
//        while (left <= word.length() - 5 && right <= word.length() && left <= right) {
//            if (word.charAt(left) == word.charAt(left + 1)) {
//                left++;
//                right++;
//                len++;
//            } else if (right + 1 < word.length() && word.charAt(right) == word.charAt(right + 1)) {
//                right++;
//                len++;
//            }
//        }
//        return max;
    }

    public boolean help(String str) {
        if (str.length() < 5)
            return false;
        char s[] = str.toCharArray();
        Arrays.sort(s);
        if (!str.equals(new String(s)))
            return false;
        Map<Character, Integer> map = new HashMap<>();
        for (char ss : s) {
            if (!map.containsKey(ss))
                map.put(ss, 1);
        }
        if (map.keySet().size() != 5)
            return false;
        return true;
    }
}
