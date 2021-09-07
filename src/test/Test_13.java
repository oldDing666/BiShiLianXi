package test;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/5/14 2:21 下午
 */
public class Test_13 {
    public static void main(String[] args) {
        int start = 7;
        int end = 11;
//        System.out.println(111);
        System.out.println(new Test_13().print(2, 5));
    }

    public String print(int start, int end) {
        // TODO: Please implement toString() method according to Javadoc.
        // <--start-
        if (start <= 0 || end <= 0 || start > end)
            throw new IllegalArgumentException();
        String res = "";

        for (int i = start; i <= end; i++) {
            for (int j = start; j <= i; j++) {
                String temp = i + "*" + j + "=" + i * j;

                String maxColLengthStr = end + "*" + j + "=" + end * j;
                int maxColLength = maxColLengthStr.length() + 2;

                while (temp.length() < maxColLength) {
                    temp += " ";
                }
                res += temp;
            }
            res += "\n";
        }
        return res;
        //        throw new RuntimeException("Delete me");
        // ---end->
    }
}
