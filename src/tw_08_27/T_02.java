package tw_08_27;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/8/27 3:26 下午
 */
public class T_02 {
    static int index = 0;
    public static void main(String[] args) {
        int n = 5;
       fib(n);
        System.out.println(index);
    }

    private static int fib(int n) {
        System.out.println("print");
        index++;
        if (n==0)
            return 0;
        if (n==1)
            return 1;
        return fib(n-1)+fib(n-2);
    }

}
