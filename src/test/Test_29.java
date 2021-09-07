package test;

import java.util.*;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/6/22 3:47 下午
 */
public class Test_29 {
    public static void main(String[] args) {
        Gou g1 = new Gou(1, "g1");
        Gou g2 = new Gou(2, "g2");
        Gou g3 = new Gou(3, "g3");
        Gou g4 = new Gou(4, "g4");
        List<Gou> list = Arrays.asList(g1, g2, g3, g4, g3, g4, g2, g1);
        System.out.println(list);
        Map<Gou, Integer> map1 = new HashMap<>();
        Map<Gou, Integer> map2 = new LinkedHashMap<>();

        for (Gou g : list) {
            map1.put(g, map1.getOrDefault(g, 0) + 1);
            map2.put(g, map2.getOrDefault(g, 0) + 1);
        }

        System.out.println("HashMap是无序的：");
        for (Map.Entry entry : map1.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        System.out.println("LinkedHashMap是有序的：");
        for (Map.Entry entry : map2.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        System.out.println("=======================");
        Map<Integer, Integer> map3 = new HashMap<>();
        Map<Integer, Integer> map4 = new LinkedHashMap<>();
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 3, 2, 1);
        for (int i : list2) {
            map3.put(i, map3.getOrDefault(i, 0) + 1);
            map4.put(i, map4.getOrDefault(i, 0) + 1);
        }
        System.out.println("HashMap是无序的：");
        for (Map.Entry entry : map3.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        System.out.println("LinkedHashMap是有序的：");
        for (Map.Entry entry : map4.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}

class Gou {
    int id;
    String name;

    public Gou() {
    }

    public Gou(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "[" + id + ":" + name + "]";
    }
}
