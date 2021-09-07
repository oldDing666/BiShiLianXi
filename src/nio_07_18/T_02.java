package nio_07_18;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/7/18 7:30 下午
 */
public class T_02 {
    public static void main(String[] args) {
        int[] a = {2, 7, 9, 4, 1};
        int n = 5;
        System.out.println(new T_02().countArea(a, n));
    }

    public int countArea(int[] A, int n) {
        // write code here
        int max = 0;
        for (int i = 0; i < A.length; i++) {
            int temp = A[i];

            for (int j = i - 1; j >= 0; j--) {
                if (A[j] < A[i]) {
                    break;
                }
                temp += A[i];
            }

            for (int j = i + 1; j < A.length; j++) {
                if (A[j] < A[i]) {
                    break;
                }
                temp += A[i];
            }
            max = Math.max(max, temp);
        }
        return max;
    }
}
