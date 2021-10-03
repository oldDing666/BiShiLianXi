package jinshan_09_16;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/9/16 8:39 下午
 */
public class T_1 {

    public static void main(String[] args) {
//        int A[] = new int[]{1,4,4,4,5,6,1000};
        int A[] = new int[]{1,1,1,1,1,1};
        System.out.println(getCount(A,6,1,1));
    }
    public static int getCount(int[] A, int n, int a, int b) {

        int left = 0;

        int right = n - 1;

        while (left < right) {

            int mid = left + (right - left) / 2;

            if (A[mid] > a) {
                if (mid == right){
                    right--;
                    continue;
                }
                right = mid;
            } else if (A[mid] < a) {
                if (mid == left){
                    left++;
                    continue;
                }
                left = mid;
            } else {

                right--;

            }

        }

        int count = 0;

        for (int i = left; i < n; i++) {

            if (A[i] >= a && A[i] <= b)

                count++;

            if (A[i] > b)

                break;

        }

        return count;

    }


}
