package test;

import java.util.*;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/4/17 7:49 下午
 */
public class Test_01 {
    int a = 10;
    int b = 20;
    int c = 30;

    public static void main(String[] args) {
//        String str = "Tshirt 10";
//        System.out.println(str.split(" ")[0]);
//        System.out.println(str.split(" ")[1]);
        // 自动导包
        List<Integer> list = Arrays.asList(1, 3, 5, 2, 4, 6);
        Set<String> set = new HashSet<>();
        String str = " Hello World!!我在本地已经被改变了";
        String str2 = " Hello World!!我在本地已经被改变了V2";
        String str3 = " Hello World!!我在远程库已经被改变了";
        String str4 = " 我解决了远程库和本地库的冲突";
        String str5 = " 我在本地库做了修改，准备提交到github远程库";
//<<<<<<< HEAD
        String str7 = " github远程库被修改，本地库无法提交";

//=======
        String str6 = " 我在github做了修改，制造冲突";
//>>>>>>> 9a6fc968111a4b58c8cfb498516c2371266e8c47

        String str8 = " 我在本地解决了github被修改造成的冲突";
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
//        System.out.println(str.split(" ").length);
    }
}
