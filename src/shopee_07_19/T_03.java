package shopee_07_19;

import java.util.Arrays;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/7/19 2:56 下午
 */
public class T_03 {
    public static void main(String[] args) {
        String order = "22W2D";
        System.out.println(Arrays.toString(new T_03().GetEndPoint(order)));
    }

    public int[] GetEndPoint(String order) {
        // write code here
        int x_site = 0;
        int y_site = 0;
        int size = 1;
        for (int i = 0; i < order.length(); i++) {
            if (order.charAt(i) >= '0' && order.charAt(i) <= '9') {
                if (i > 0 && order.charAt(i - 1) >= '0' && order.charAt(i - 1) <= '9') {
                    int temp = order.charAt(i) - '0';
                    size = size * 10 + temp;
                } else
                    size = order.charAt(i) - '0';
                continue;
            } else {
                switch (order.charAt(i)) {
                    case 'W':
                        y_site += size;
                        break;
                    case 'S':
                        y_site -= size;
                        break;
                    case 'A':
                        x_site -= size;
                        break;
                    case 'D':
                        x_site += size;
                        break;
                    case 'w':
                        y_site += size;
                        break;
                    case 's':
                        y_site -= size;
                        break;
                    case 'a':
                        x_site -= size;
                        break;
                    case 'd':
                        x_site += size;
                        break;
                }

//                if (order.charAt(i) == 'W' || order.charAt(i) == 'w')
//                    y_site += size;
//                else if (order.charAt(i) == 'S' || order.charAt(i) == 's')
//                    y_site -= size;
//                else if (order.charAt(i) == 'A' || order.charAt(i) == 'a')
//                    x_site -= size;
//                else if (order.charAt(i) == 'D' || order.charAt(i) == 'd')
//                    x_site += size;
                size = 1;
            }
        }
        return new int[]{x_site, y_site};
    }
}
