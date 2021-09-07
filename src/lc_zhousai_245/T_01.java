package lc_zhousai_245;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/6/13 10:08 上午
 */
public class T_01 {
    public static void main(String[] args) {
//        String[] words = {"abc", "aabc", "bc"};
        String[] words = {"ab","a"};
        System.out.println(makeEqual(words));
    }

    public static boolean makeEqual(String[] words) {
        int n = words.length;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            char ss[] = words[i].toCharArray();
            for (int j = 0; j < ss.length; j++) {
                map.put(ss[j], map.getOrDefault(ss[j], 0) + 1);
            }
        }
        for (char s : map.keySet()) {
            if (map.get(s) % n != 0)
                return false;
        }
        return true;
    }
}
