package lc_zhousai_255;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/8/22 9:55 上午
 */
public class T_02 {
    public static void main(String[] args) {
//        String nums[] = {"01", "10"};
//        String nums[] = {"00", "01"};
        String nums[] = {"111","011","001"};
        System.out.println(findDifferentBinaryString(nums));
    }

    public static String findDifferentBinaryString(String[] nums) {
        int n = nums.length;
        StringBuilder sbMax = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sbMax.append("1");
        }
        int max = Integer.valueOf(sbMax.toString(), 2);
        for (int i = 0; i <= max; i++) {
            String temp = Integer.toString(i, 2);
            int len = temp.length();
            if (len < n) {
                for (int j = 0; j < n - len; j++) {
                    temp = "0" + temp;
                }
            }
            boolean flag = false;
            for (String s : nums) {
                if (s.equals(temp)) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                return temp;
            }
        }
        return "";
    }
}
