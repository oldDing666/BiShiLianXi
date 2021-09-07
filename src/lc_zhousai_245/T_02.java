package lc_zhousai_245;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/6/13 10:08 上午
 */
public class T_02 {
    public static void main(String[] args) {
        String s = "abcacb";
        String p = "ab";
        int[] removable = {3, 1, 0};
        System.out.println(new T_02().maximumRemovals(s, p, removable));
    }

    public int maximumRemovals(String s, String p, int[] removable) {
        if (removable.length == 0)
            return 0;
        int n = removable.length - 1;
        char ss[] = s.toCharArray();
        for (int i = 0; i <= n; i++) {
            ss[removable[i]] = '0';
        }
        for (int i = n; i >= 0; i--) {
            if (s.length() - (i + 1) < p.length()) {
                ss[removable[i]] = s.charAt(removable[i]);
                continue;
            }
            if (help2(String.valueOf(ss), p))
                return i + 1;
            ss[removable[i]] = s.charAt(removable[i]);
        }
        return 0;
    }

    private boolean help2(String s, String p) {
        if (s.length() < p.length())
            return false;
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            if (index >= p.length())
                return true;
            if (s.charAt(i) == p.charAt(index)) {
                index++;
            }
        }
        return index >= p.length();
    }
}
