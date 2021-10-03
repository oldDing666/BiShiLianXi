package lc_zhousai_261;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/10/3 10:31 上午
 */
public class T_1 {
    public static void main(String[] args) {
        String str = "OXOOX";
        System.out.println(minimumMoves("XXOX"));
    }

    public static int minimumMoves(String s) {
        if (!s.contains("X"))
            return 0;
        int count = 0;
        for (int i = 0; i <= s.length() - 1; i++) {
            String ss = null;
            if (i + 3 > s.length()) {
                ss = s.substring(i);
            } else {
                ss = s.substring(i, i + 3);
            }
//            System.out.println(i);
//            System.out.println(ss);
            if (!ss.contains("X")) {
                i = i + 2;
            } else if (ss.startsWith("O")) {

            } else {
                count++;
                i = i + 2;
            }
        }
        return count;
    }
}
