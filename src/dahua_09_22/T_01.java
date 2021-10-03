package dahua_09_22;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/9/22 3:38 下午
 */
public class T_01 {
    public static void main(String[] args) {
        int a = 5;
        int b = 8;
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println(a);
        System.out.println(b);
    }
}
