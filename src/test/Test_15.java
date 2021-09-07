package test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/5/21 7:40 下午
 */
public class Test_15 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "111");
        map.put(2, "222");
        map.put(3, "333");
        map.put(4, "444");
        for (int i : map.keySet()) {
            System.out.println(map.get(i));
        }
        System.out.println("===================");
        System.out.println(map.remove(2));
        System.out.println("===================");
        for (int i : map.keySet()) {
            System.out.println(map.get(i));
        }
        
    }
}
