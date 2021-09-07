package dotcpp_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/6/5 3:15 下午
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
            List<int[]> list = new ArrayList<>();
            int[] n1 = new int[]{1};
            int[] n2 = new int[]{1, 1};
            list.add(n1);
            list.add(n2);
            for (int i = 2; i < n; i++) {
                int nums1[] = new int[i + 1];
                nums1[0] = 1;
                nums1[i] = 1;
                int nums2[] = list.get(i - 1);
                for (int j = 1; j < i; j++) {
                    nums1[j] = nums2[j - 1] + nums2[j];
                }
                list.add(nums1);
            }

            for (int i = 0; i < list.size(); i++) {
//                System.out.println(Arrays.toString(list.get(i)));
                int temp[] = list.get(list.size() - 1 - i);
                StringBuilder sb = new StringBuilder();
                for (int j = 1; j <= 3 * (i + 1) - 1; j++) {
                    sb.append(" ");
                }
                for (int j = 0; j < temp.length; j++) {
                    sb.append(temp[j]);
                    if (j != temp.length - 1) {
                        for (int k = 1; k <= 6 - (temp[j + 1] + "").length(); k++) {
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
