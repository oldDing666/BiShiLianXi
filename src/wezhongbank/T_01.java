package wezhongbank;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/9/23 7:45 下午
 */
public class T_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
//        System.out.println(Arrays.toString(nums));
        int res[] = new int[n];
        res[0] = nums[0];
        for (int i = 1; i < n; i++) {
            if (i%2==1){
                res[i] = nums[i-1]-nums[i];
            }else {
                res[i] = nums[i]-nums[i-1];
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ",res[i]);
        }
//        System.out.println(Arrays.toString(res));
    }
}
