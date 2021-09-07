package atGuiGuStudy.jvm;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/8/25 9:40 下午
 */
public class HelloGC {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("*********HelloGC********");
        Thread.sleep(Integer.MAX_VALUE);


//        // 获取cpu核心数
//        System.out.println(Runtime.getRuntime().availableProcessors());
//        // 返回Java虚拟机中的内存总量，约等于真实物理内存的1/16
//        long totalMemory = Runtime.getRuntime().totalMemory();
//        // 返回Java虚拟机试图使用的最大内存量，约等于真实物理内存的1/4
//        long maxMemory = Runtime.getRuntime().maxMemory();
//        System.out.println("TOTAL_MEMORY(-Xms) = "+totalMemory+"（字节）、"+(totalMemory/(double)1024/1024)+"MB");
//        System.out.println("MAX_MEMORY(-Xmx) = "+maxMemory+"（字节）、"+(maxMemory/(double)1024/1024)+"MB");
        
    }
}
