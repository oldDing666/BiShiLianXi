package test;

import java.util.Arrays;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/5/26 3:32 下午
 */
public class Test_22 {
    public static void main(String[] args) {
//        int num1 = 10;
//        // 新定义一个变量，将其指向num1
//        int num2 = num1;
//        // 新定义一个变量，设置一个与num1相等的值
//        int num3 = 10;
//        System.out.println("num1 = " + num1);
//        System.out.println("num2 = " + num2);
//        System.out.println("num3 = " + num3);
//        // 改变num1的值
//        num1 = 20;
//        System.out.println("num1 = " + num1);
//        System.out.println("num2 = " + num2);
//        System.out.println("num3 = " + num3);

//        int[] nums1 = {1, 2, 3, 4, 5};
//        // 新定义一个数组，将其指向nums1
//        int[] nums2 = nums1;
//        // 新定义一个数组，设置一个与num1相等的值
//        int[] nums3 = new int[nums1.length];
//        System.arraycopy(nums1, 0, nums3, 0, nums1.length);
//        System.out.println("nums1: " + Arrays.toString(nums1));
//        System.out.println("nums2: " + Arrays.toString(nums2));
//        System.out.println("nums3: " + Arrays.toString(nums3));
//        // 改变nums1的值
//        nums1[0] = 0;
//        System.out.println("nums1: " + Arrays.toString(nums1));
//        System.out.println("nums2: " + Arrays.toString(nums2));
//        System.out.println("nums3: " + Arrays.toString(nums3));

        String str1 = new String("abc");
        String str2 = str1;
        String str3 = new String("abc");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        str1 = new String("def");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

    }
}
