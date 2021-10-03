package JZOffer_v1;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/9/25 10:44 上午
 */
public class T_20 {
    public boolean isNumber(String s) {
        if (s == null || s.length() == 0)
            return false;
        s = s.trim();
        try {
            Double.parseDouble(s);
        } catch (Exception e) {
            return false;
        }

        char last = s.charAt(s.length() - 1);
        if (last >= '0' && last <= '9' || last == '.')
            return true;
        return false;
    }
}
