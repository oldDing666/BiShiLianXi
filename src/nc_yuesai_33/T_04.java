package nc_yuesai_33;

import java.util.*;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/4/17 7:23 下午
 */
public class T_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            // 商品种类数
            int s = sc.nextInt();
            // 人数
            int n = sc.nextInt();
            // 统计商品种类和数量
            Map<String, Integer> map = new HashMap<>();
            String str0 = sc.nextLine();
            for (int j = 0; j < s; j++) {
                String str1 = sc.nextLine();
                String key = str1.split(" ")[0];
                int value = Integer.parseInt(str1.split(" ")[1]);
                map.put(key, value);
            }
            // 统计人拥有的商品种类
            for (int j = 0; j < n; j++) {
                String str2 = sc.nextLine();
                int num = Integer.parseInt(str2.split(" ")[0]);
                // 拥有的商品
                Set<String> set = new HashSet<>();
                for (int k = 0; k < num; k++) {
                    String ss = str2.split(" ")[k + 1];
                    set.add(ss);
                }
                // 不拥有的商品就减一
                for (String sss : map.keySet()) {
                    if (!set.contains(sss)) {
                        map.put(sss, map.get(sss) - 1);
                    }
                }
            }
            int count = 0;
            for (String sss : map.keySet()) {
                if (map.get(sss) > 0) {
                    count++;
                }
            }
            System.out.println(count > 0 ? count : "Need to be lucky");
        }
    }
}
