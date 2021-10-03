package test;
import java.util.*;


/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/9/19 9:57 上午
 * 多个连续字符串替换为一个
 */
public class Test_30 {
    public static void main(String[] args) {
        String str = "   a b  c   d    ef d     e ";
//        boolean start = str.startsWith(" ");
//        boolean end = str.endsWith(" ");
//        str = str.trim();
//        System.out.println(start);
//        System.out.println(end);
        System.out.println(str);
        System.out.println("===============");
        str = str.replaceAll("\\s+", " ");
//        if (start)
//            str = " " + str;
//        if (end)
//            str = str + " ";
        System.out.println(str);
    }

}
