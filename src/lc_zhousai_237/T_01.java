package lc_zhousai_237;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/4/18 10:19 上午
 */
public class T_01 {
    public boolean checkIfPangram(String sentence) {
        if (sentence.length() < 26) {
            return false;
        }
        int nums[] = new int[26];
        for (int i = 0; i < sentence.length(); i++) {
            nums[sentence.charAt(i) - 'a']++;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= 0) {
                return false;
            }
        }
        return true;
    }
}
