package lc_zhousai_254;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/8/15 10:38 上午
 */
public class T_01 {
    public int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for (int i = 0; i < patterns.length; i++) {
            if (word.contains(patterns[i]))
                count++;
        }
        return count;
    }
}
