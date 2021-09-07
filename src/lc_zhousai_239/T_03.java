package lc_zhousai_239;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/5/2 9:36 上午
 */
public class T_03 {
    public static void main(String[] args) {
        String num = "5489355142";
        int k = 1;
        System.out.println(new T_03().getMinSwaps(num, k));
    }

    public int getMinSwaps(String num, int k) {
        int res = 0;
        char nums[] = num.toCharArray();
        while (k > 0) {
            boolean flag = false;
            for (int i = nums.length - 1; i >= 1; i--) {
                for (int j = i - 1; j >= 0; j--) {
                    if (nums[i] > nums[j]) {
                        k--;
                        flag = true;
                        char t = nums[i];
                        nums[i] = nums[j];
                        nums[j] = t;
                        break;
                    }
                }
                if (flag)
                    break;
            }
        }
        num = String.valueOf(nums);
        System.out.println(num);
        return res;
    }
}
