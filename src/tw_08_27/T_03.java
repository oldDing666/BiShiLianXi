package tw_08_27;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/8/27 3:54 下午
 */
class P {
    void f(int i) {
        System.out.println(i);
    }
}

class Q extends P {
    @Override
    void f(int i) {
        System.out.println(2 * i);
    }
}

public class T_03 {
    public static void main(String[] args) {
        P x = new Q();
        Q y = new Q();
        P z = new Q();
        x.f(1);
        ((P) y).f(1);
        z.f(1);
    }
}
