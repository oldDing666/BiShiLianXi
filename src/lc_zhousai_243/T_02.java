package lc_zhousai_243;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/5/30 10:30 上午
 */
public class T_02 {
    public static void main(String[] args) {
//        String n = "73";
//        String n = "-55";
//        String n = "-132";
//        String n = "469975787943862651173569913153377";
        String n = "99";
//        int x = 6;
//        int x = 2;
//        int x = 3;
//        int x = 3;
        int x = 9;
        System.out.println(new T_02().maxValue(n, x));
    }

    public String maxValue(String n, int x) {
        String res = "";
        boolean flag = true;
        if (n.charAt(0) == '-') {
            res += "-";
            for (int i = 1; i < n.length(); i++) {
                if (n.charAt(i) - '0' > x) {
                    res += n.substring(1, i);
                    res += x;
                    res += n.substring(i, n.length());
                    flag = false;
                    break;
                }
            }
            if (flag)
                res = n + x;
        } else {
            for (int i = 0; i < n.length(); i++) {
                if (n.charAt(i) - '0' < x) {
                    res += n.substring(0, i);
                    res += x;
                    res += n.substring(i, n.length());
                    flag = false;
                    break;
                }
            }
            if (flag)
                res = n + x;
        }
        return res;
    }
}
