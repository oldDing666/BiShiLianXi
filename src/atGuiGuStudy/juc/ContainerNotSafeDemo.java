package atGuiGuStudy.juc;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/8/18 10:31 上午
 */

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * 集合类不安全问题
 * ArrayList
 */
public class ContainerNotSafeDemo {
    public static void main(String[] args) {
        // 线程不安全
        // List<String> list = new ArrayList<>();
        // 3.1 Vector保证了数据一致性，但是并发性大幅下降
        // List<String> list = new Vector<>();
        // 3.2
        // List<String> list = Collections.synchronizedList(new ArrayList<>());
        // 3.3
        List<String> list = new CopyOnWriteArrayList<>();
        for (int i = 1; i <= 30; i++) {
            new Thread(() -> {
                list.add(UUID.randomUUID().toString().substring(0, 8));
                System.out.println(list);
            }, String.valueOf(i)).start();
        }
    }

    // java.util.ConcurrentModificationException

    /**
     * 1 故障现象
     *      （并发修改异常）
     *      java.util.ConcurrentModificationException
     *
     * 2 导致原因
     *      并发争抢修改导致 异常。一个线程正在写入，另一个线程过来抢夺，导致数据不一致
     *
     * 3 解决方案
     *  3.1 new Vector<>();
     *  3.2 Collections.synchronizedList(new ArrayList<>());
     *  写时复制，读写分离的思想
     *  3.3 new CopyOnWriteArrayList<>();
     *
     * 4 优化建议（同样的错误不犯第2次）
     *
     */
}
