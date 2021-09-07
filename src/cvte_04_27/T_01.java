package cvte_04_27;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/4/27 6:41 下午
 */
public class T_01 {
    public static void main(String[] args) {
        String str = "abc,bcd cde.def";
        String s[] = str.split("[\\., ]");
        for (String ss : s) {
            System.out.println(ss);
        }
    }
}
