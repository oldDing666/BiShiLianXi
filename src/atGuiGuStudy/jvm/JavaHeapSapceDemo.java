package atGuiGuStudy.jvm;

import java.util.Random;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/8/30 10:36 上午
 */
public class JavaHeapSapceDemo {
    public static void main(String[] args) {
        /**
         String str = "abcdef";
         while (true) {
         // 加上不同的字符串
         str += str + new Random().nextInt(111111) + new Random().nextInt(22222);
         str.intern();
         }
         */

        byte[] bytes = new byte[80 * 1024 * 1024];
        // Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
    }
}
