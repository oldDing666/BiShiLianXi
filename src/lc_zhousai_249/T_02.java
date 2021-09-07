package lc_zhousai_249;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/7/11 9:29 上午
 */
public class T_02 {

    public static void main(String[] args) {
        String str = "bbcbaba";
        System.out.println(new T_02().countPalindromicSubsequence(str));
    }


    public void printAllSub(char[] str, int i, String res, List<String> list) {
        if (i == str.length) {
            if (res.length() == 3 && !list.contains(res) && res.equals(new StringBuilder(res).reverse().toString()))
                list.add(res);
            return;
        } else {
            printAllSub(str, i + 1, res, list); // 不要下标为i+1的字符
            printAllSub(str, i + 1, res + str[i], list); // 要第i+1个字符
        }
    }

    public int countPalindromicSubsequence(String s) {
        List<String> list = new ArrayList<>();
        printAllSub(s.toCharArray(), 0, "", list);
        return list.size();
    }
}
