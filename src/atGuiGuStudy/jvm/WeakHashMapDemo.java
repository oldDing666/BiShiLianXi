package atGuiGuStudy.jvm;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/8/27 10:55 上午
 */
public class WeakHashMapDemo {
    public static void main(String[] args) {
        myHashMap();
        System.out.println("==================");
        myWeakHashMap();

    }

    public static void myWeakHashMap() {
        WeakHashMap<Integer,String> map = new WeakHashMap<>();
//        Integer key = 2;
        // 要写成下面的形式
        Integer key = new Integer(2);
        String value = "WeakHashMap";

        map.put(key,value);
        // {2=WeakHashMap}
        System.out.println(map);
        key = null;
        // {2=WeakHashMap}
        System.out.println(map);

        System.gc();
        // {}，只要GC，key就会被回收
        System.out.println(map);
    }

    public static void myHashMap() {
        Map<Integer,String> map = new HashMap<>();
//        Integer key = 1;
        Integer key = new Integer(1);
        String value = "HashMap";

        map.put(key,value);
        // {1=HashMap}
        System.out.println(map);
        key = null;
        // {1=HashMap}
        System.out.println(map);

        System.gc();
        // {1=HashMap}
        System.out.println(map);
    }
}
