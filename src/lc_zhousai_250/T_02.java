package lc_zhousai_250;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/7/18 10:21 上午
 */
public class T_02 {
    public static void main(String[] args) {
        int[] rungs = {1, 3, 5, 10};
        int dist = 2;

//        int[] rungs = {3,6,8,10};
//        int dist = 3;

//        int[] rungs = {3,4,6,7};
//        int dist = 2;

//        int[] rungs = {5};
//        int dist = 10;

//        int[] rungs = {3};
//        int dist = 1;
        System.out.println(new T_02().addRungs(rungs, dist));
    }

    public int addRungs(int[] rungs, int dist) {
        int count = 0;
        if (rungs[0] > dist) {
            count = rungs[0] / dist;
            if (rungs[0] % dist == 0)
                count--;
        }

        for (int i = 0; i < rungs.length - 1; i++) {
            if (rungs[i + 1] - rungs[i] > dist) {
                count += (rungs[i + 1] - rungs[i]) / dist;
                if ((rungs[i + 1] - rungs[i]) % dist == 0)
                    count--;
            }
        }
        return count;
    }
}
