package atGuiGuStudy.jvm;

import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/8/30 4:04 下午
 */
public class DirectBufferMemoryDemo {
    public static void main(String[] args) {
        System.out.println("配置的maxDirectMemory: " + (sun.misc.VM.maxDirectMemory() / (double) 1024 / 1024) + "MB");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // -Xms10m -Xmx10m -XX:+PrintGCDetails -XX:MaxDirectMemorySize=5m
        // 直接内存配置为5m，但实际使用6m
        //  Exception in thread "main" java.lang.OutOfMemoryError: Direct buffer memory
        ByteBuffer bb = ByteBuffer.allocateDirect(6 * 1024 * 1024);
    }
}
