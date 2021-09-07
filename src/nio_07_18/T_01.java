package nio_07_18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/7/18 7:16 下午
 */
public class T_01 {
    public static void main(String[] args) {
        String digits = "23";
        new T_01().letterCombinations(digits);
    }

    public ArrayList<String> letterCombinations(String digits) {
        // write code here
        ArrayList<String> res = new ArrayList<>();
        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        ArrayList<String> strs = new ArrayList<>();
        for (int i = 0; i < digits.length(); i++) {
            strs.add(map.get(digits.charAt(i)));
        }
//        System.out.println(strs);

        dfs(strs, res);

        return res;
    }

    private void dfs(ArrayList<String> strs, ArrayList<String> res) {
        for (int i = 0; i < strs.size(); i++) {

        }
    }
}
