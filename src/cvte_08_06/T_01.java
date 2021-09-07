package cvte_08_06;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/8/6 7:01 下午
 */
public class T_01 {
    public static void main(String[] args) {
        int x = 5, y = 5;
        for (int i = 0; x > 3; y = i++) {
            System.out.printf("%d, %d\n", --x, y);
        }
    }
}
