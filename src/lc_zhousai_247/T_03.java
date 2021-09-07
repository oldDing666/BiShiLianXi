package lc_zhousai_247;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/6/27 10:34 上午
 */
public class T_03 {
    public static void main(String[] args) {
        String word = "aabb";
        System.out.println(new T_03().wonderfulSubstrings(word));
    }

    public long wonderfulSubstrings(String word) {
        long count = 0;
        int n = word.length();
        Set<String> set = new HashSet<>();
        for (int i = 0; i <= n - 1; i++) {
            for (int j = i + 1; j <= n; j++) {
                String str = word.substring(i, j);
                if (set.contains(str)) {
                    count++;
                    continue;
                }
                set.add(str);
                int[] a = new int[10];
                for (int k = 0; k < str.length(); k++) {
                    a[str.charAt(k) - 'a']++;
                }
                int sum = 0;
                for (int k = 0; k < 10; k++) {
                    if (a[k] % 2 == 1)
                        sum++;
                }
                if (sum <= 1) {
                    count++;
                }
            }
        }
        return count;
    }

    private boolean help(String str) {
        char s[] = str.toCharArray();
        int count = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length; i++) {
            map.put(s[i], map.getOrDefault(s[i], 0) + 1);
        }
        for (Map.Entry entry : map.entrySet()) {
            if ((int) (entry.getValue()) % 2 == 1)
                count++;
        }
        return count <= 1;
    }
}
