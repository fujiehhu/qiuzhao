package BS.HW;

import java.util.Scanner;

/**
 * Created by lenovo on 20/9/2.
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ss = scanner.nextLine();
        String[] split = ss.split(",");
        int row = Integer.valueOf(split[0].trim());
        int col = Integer.valueOf(split[1].trim());
        if (row == 0 || col == 0) {
            System.out.println(0);
        } else {
            char loc[][] = new char[row][col];
            for (int i = 0; i < row; i++) {
                String s = scanner.nextLine();
                for (int j = 0; j < s.length(); j++) {
                    if (s.charAt(j) == 'S') {
                        loc[i][j] = '1';
                    }
                    if (s.charAt(j) == 'H') {
                        loc[i][j] = '0';
                    }
                }
            }
            System.out.println(numIslands(loc));
        }

    }

    static void dfs(char[][] grid, int r, int c) {
        int nr = grid.length;
        int nc = grid[0].length;

        if (r < 0 || c < 0 || r >= nr || c >= nc || grid[r][c] == '0') {
            return;
        }

        grid[r][c] = '0';
        dfs(grid, r - 1, c);
        dfs(grid, r + 1, c);
        dfs(grid, r, c - 1);
        dfs(grid, r, c + 1);
    }

    public static int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int nr = grid.length;
        int nc = grid[0].length;
        int num_islands = 0;
        for (int r = 0; r < nr; ++r) {
            for (int c = 0; c < nc; ++c) {
                if (grid[r][c] == '1') {
                    ++num_islands;
                    dfs(grid, r, c);
                }
            }
        }

        return num_islands;
    }

}
