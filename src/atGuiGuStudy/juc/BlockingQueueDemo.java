package atGuiGuStudy.juc;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/8/19 11:14 上午
 */
public class BlockingQueueDemo {

    public static void main(String[] args) throws InterruptedException {
//        List<String> list = new ArrayList<>();
        BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(3);
//        System.out.println(blockingQueue.add("a"));
//        System.out.println(blockingQueue.add("b"));
//        System.out.println(blockingQueue.add("c"));
        // 超出了长度限制，直接抛出异常
        // java.lang.IllegalStateException: Queue full
//        System.out.println(blockingQueue.add("c"));

//        System.out.println(blockingQueue.remove());
//        System.out.println(blockingQueue.remove());
//        System.out.println(blockingQueue.remove());
        // 此时blockingQueue为空，再继续删除元素，则抛出异常
//        java.util.NoSuchElementException
//        System.out.println(blockingQueue.remove());

        // 此时blockingQueue为空,element()方法为获取队列头部元素，直接抛出异常
        // java.util.NoSuchElementException
//        System.out.println(blockingQueue.element());

//        System.out.println(blockingQueue.offer("a"));
//        System.out.println(blockingQueue.offer("b"));
//        System.out.println(blockingQueue.offer("c"));
//        // 当超出长度限制后，不会抛异常，返回false
//        System.out.println(blockingQueue.offer("d"));
//
//        System.out.println(blockingQueue.poll());
//        System.out.println(blockingQueue.poll());
//        System.out.println(blockingQueue.poll());
//        // 当列表为空时，再删除元素，也不会抛异常，返回null
//        System.out.println(blockingQueue.poll());
//        // 列表中没有元素，返回null
//        System.out.println(blockingQueue.peek());

//        blockingQueue.put("a");
//        blockingQueue.put("b");
//        blockingQueue.put("c");
//        System.out.println("==========");
//        // 当超出长度限制，还要继续添加元素时，线程会一直阻塞，直到队列中有空位。
////        blockingQueue.put("d");
//
//        // take方法同理
//        blockingQueue.take();
//        blockingQueue.take();
//        blockingQueue.take();
//        System.out.println("-----------");
//        blockingQueue.take();

        // 插入成功，则不需要等待
        System.out.println(blockingQueue.offer("a", 2, TimeUnit.SECONDS));
        System.out.println(blockingQueue.offer("b", 2, TimeUnit.SECONDS));
        System.out.println(blockingQueue.offer("c", 2, TimeUnit.SECONDS));
        // 等待2秒，如果没有插入成功，则退出
        System.out.println(blockingQueue.offer("d", 2, TimeUnit.SECONDS));

    }
}
