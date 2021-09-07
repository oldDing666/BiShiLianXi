package dotcpp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/6/4 9:49 下午
 */
public class T_1186 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n == 1) {
                System.out.println("  1");
                System.out.println();
                continue;
            }
            if (n == 2) {
                System.out.println("  1     1");
                System.out.println("     1");
                System.out.println();
                continue;
            }
            List<int[]> list = new ArrayList<>();
            int[] n1 = new int[]{1};
            int[] n2 = new int[]{1, 1};
            list.add(n1);
            list.add(n2);
            for (int i = 2; i < n; i++) {
                int[] nums = new int[i + 1];
                nums[0] = 1;
                nums[i] = 1;
                int[] temp = list.get(i - 1);
                for (int j = 1; j < i; j++) {
                    nums[j] = temp[j - 1] + temp[j];
                }
                list.add(nums);
            }

            for (int i = 0; i < list.size(); i++) {
                int[] arr = list.get(list.size() - 1 - i);
                StringBuilder sb = new StringBuilder();
                sb.append(" ");
                sb.append(" ");

                for (int j = 0; j < i; j++) {
                    sb.append(" ");
                    sb.append(" ");
                    sb.append(" ");
                }

                for (int j = 0; j < arr.length; j++) {
                    sb.append(arr[j]);
                    if (j != arr.length - 1) {
                        for (int k = 0; k < 5 - (arr[j + 1] + "").length() + 1; k++) {
                            sb.append(" ");
                        }
                    }
                }
                System.out.println(sb.toString());
            }
            System.out.println();
        }
    }
}
