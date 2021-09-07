package zijie_09_05;

import java.util.*;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/9/5 8:01 下午
 */
public class T_01 {
    public static void main(String[] args) {
        String str = "YYBBB";
        System.out.println(Arrays.toString(new T_01().permutation(str)));
    }


    List<String> res = new ArrayList<>();
    char ss[];

    public String[] permutation(String s) {
        if (s.length() == 0)
            return res.toArray(new String[res.size()]);
        ss = s.toCharArray();
        dfs(0);
        return res.toArray(new String[res.size()]);
    }

    private void dfs(int i) {
        if (i == ss.length - 1) {
            res.add(String.valueOf(ss));
            return;
        }
        Set<Character> set = new HashSet<>();
        for (int j = i; j < ss.length; j++) {
            if (set.contains(ss[j])) {
                continue;
            }
            set.add(ss[j]);
            swap(i, j);
            dfs(i + 1);
            swap(i, j);
        }
    }

    private void swap(int i, int j) {
        char tmp;
        tmp = ss[i];
        ss[i] = ss[j];
        ss[j] = tmp;
    }
}
