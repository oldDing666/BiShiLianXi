package lc_zhousai_246;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/6/20 10:30 上午
 */
public class T_03 {
    public static void main(String[] args) {

    }

    int count = 0;
    int index = 2;

    public int countSubIslands(int[][] grid1, int[][] grid2) {
        dfs(grid1, grid2, 0, 0);
        return count;
    }

    private void dfs(int[][] grid1, int[][] grid2, int row, int col) {
        int m = grid2.length;
        int n = grid2[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid2[i][j] == 1) {
                    grid2[i][j] = index;
                    dfs(grid1, grid2, row - 1, col);
                    dfs(grid1, grid2, row + 1, col);
                    dfs(grid1, grid2, row, col - 1);
                    dfs(grid1, grid2, row, col + 1);

                    index++;
                    return;
                }
            }
        }

    }
}
