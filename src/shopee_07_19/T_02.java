package shopee_07_19;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/7/19 2:56 下午
 */
public class T_02 {
    public static void main(String[] args) {
        int row = 5;
        int col = 3;
        System.out.println(new T_02().getValue(row, col));
    }

    public int getValue(int rowIndex, int columnIndex) {
        // write code here
        if (rowIndex == 1 || columnIndex == 1 || rowIndex == columnIndex)
            return 1;

        int[][] nums = new int[rowIndex][rowIndex];
        nums[0][0] = 1;
        nums[1][0] = 1;
        nums[1][1] = 1;
        for (int i = 2; i < rowIndex; i++) {
            nums[i][0] = 1;
            nums[i][rowIndex - 1] = 1;
            for (int j = 1; j <= rowIndex - 2; j++) {
                nums[i][j] = nums[i - 1][j - 1] + nums[i - 1][j];
            }
        }
        return nums[rowIndex - 1][columnIndex - 1];
    }
}
