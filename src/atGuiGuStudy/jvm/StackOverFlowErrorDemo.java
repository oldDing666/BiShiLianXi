package atGuiGuStudy.jvm;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/8/27 12:10 下午
 */
public class StackOverFlowErrorDemo {
    public static void main(String[] args) {
        // Exception in thread "main" java.lang.StackOverflowError
        stackOverflowError();
    }

    private static void stackOverflowError() {
        stackOverflowError();
    }
}
