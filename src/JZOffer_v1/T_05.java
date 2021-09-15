package JZOffer_v1;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/9/15 2:08 下午
 */
public class T_05 {
    public String replaceSpace(String s) {
        char ss[] = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ss.length; i++) {
            if (ss[i] == ' ') {
                sb.append("%20");
            } else
                sb.append(ss[i]);
        }
        return sb.toString();
    }
}
