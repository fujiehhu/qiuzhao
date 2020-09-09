package BS.XM;

import java.util.Scanner;

/**
 * Created by lenovo on 20/9/8.
 */
public class Main2 {
    static boolean flag;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[][] board = {
                {'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}
        };
        while (scanner.hasNextLine()){
            String word = scanner.nextLine();
            System.out.println(exist(board, word));
        }

//        System.out.println("true");
    }

    public static boolean exist(char[][] board, String word) {
        if (board == null || board.length == 0) {
            return false;
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(board, i, j, word, 0)) {
                    return true;
                }

            }

        }
        return false;
    }

    public static boolean dfs(char[][] board, int i, int j, String word, int cur) {
        if (cur == word.length()) {
            flag = true;
            return true;
        }
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(cur)) {
            return false;
        }
        if (!flag) {
            char c = board[i][j];
            board[i][j] = '.';
            boolean res1 = dfs(board, i + 1, j, word, cur + 1);
            boolean res2 = dfs(board, i - 1, j, word, cur + 1);
            boolean res3 = dfs(board, i, j + 1, word, cur + 1);
            boolean res4 = dfs(board, i, j - 1, word, cur + 1);
            board[i][j] = c;
            return res1 || res2 || res3 || res4;
        } else {
            return true;
        }
    }
}
