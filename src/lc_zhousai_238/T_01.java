package lc_zhousai_238;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/4/25 10:23 上午
 */
public class T_01 {
    public static void main(String[] args) {
        System.out.println(new T_01().sumBase(10, 10));
    }

    public int sumBase(int n, int k) {
        char s[] = Integer.toString(n, k).toCharArray();
        int sum = 0;
        for (char ss : s) {
            sum += ss - '0';
        }
        return sum;
    }
}
