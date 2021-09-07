package nio_07_18;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/7/18 7:43 下午
 */
public class T_03 {
    public static void main(String[] args) {
        int[] a = {1, -2, 3, 10, -4, 7, 2, -5};
        System.out.println(new T_03().FindGreatestSumOfSubArray(a));
    }

    public int FindGreatestSumOfSubArray(int[] array) {
        int max = 0;
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            temp += array[i];
            if (temp < 0)
                temp = 0;
            max = Math.max(max, temp);
        }
        return max;
    }
}
