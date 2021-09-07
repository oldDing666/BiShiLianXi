package lc_zhousai_243;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/5/30 10:30 上午
 */
public class T_01 {
    public static void main(String[] args) {
        String s1 = "acb";
        String s2 = "cba";
        String s3 = "cdb";
        System.out.println(new T_01().isSumEqual(s1, s2, s3));
    }

    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        char[] s1 = firstWord.toCharArray();
        char[] s2 = secondWord.toCharArray();
        char[] s3 = targetWord.toCharArray();
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int temp;
        for (char s : s1) {
            temp = s - 'a';
            num1 = num1 * 10 + temp;
        }
        for (char s : s2) {
            temp = s - 'a';
            num2 = num2 * 10 + temp;
        }
        for (char s : s3) {
            temp = s - 'a';
            num3 = num3 * 10 + temp;
        }
//        System.out.println(num1);
//        System.out.println(num2);
//        System.out.println(num3);
        return num1 + num2 == num3;
    }
}
