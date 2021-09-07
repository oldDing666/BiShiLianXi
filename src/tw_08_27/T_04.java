package tw_08_27;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/8/27 4:02 下午
 */
public class T_04 {
    public static void main(String[] args) {
        int number = 23;
        System.out.println(possibleCombinations(number));
    }
    public static String possibleCombinations(int numbers) {
        StringBuilder sb = new StringBuilder();
        Map<Integer, String> map = new HashMap<>();
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");
        int a = numbers / 10;
        int b = numbers % 10;
        if (a == 0 || b == 0)
            return "N/A";
        String str1 = map.get(a);
        String str2 = map.get(b);
        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                String temp = str1.charAt(i) + "" + str2.charAt(j);
                temp = temp.toUpperCase();
                sb.append(temp);
                sb.append(" ");
            }
        }
        String res = sb.toString();
        return res.substring(0, res.length() - 1);
    }
}
