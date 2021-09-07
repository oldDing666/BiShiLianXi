package lc_zhousai_244;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/6/6 10:25 上午
 */
public class T_01 {
    public static void main(String[] args) {
//        int nums1[][] = new int[][]{{0, 1}, {1, 0}};
//        int nums2[][] = new int[][]{{1, 0}, {0, 1}};

        int nums1[][] = new int[][]{{0, 0, 0}, {0, 1, 0}, {1, 1, 1}};
        int nums2[][] = new int[][]{{1, 1, 1}, {0, 1, 0}, {0, 0, 0}};
        System.out.println(new T_01().findRotation(nums1, nums2));
    }

    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;
        int nums[][] = new int[n][n];
        for (int k = 1; k <= 4; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    nums[i][j] = mat[n - 1 - j][i];
//                nums[i][j] = mat[j][i];
                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    mat[i][j] = nums[i][j];
//                    System.out.printf("%d ", nums[i][j]);
                }
                System.out.println();
            }
//            System.out.println("=========");
            if (help(mat, target))
                return true;
        }

        return false;
    }

    private boolean help(int[][] mat, int[][] target) {
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] != target[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
