package LC;

/**
 * Created by lenovo on 20/9/14.
 */
public class 不同路径 {
    public static void main(String[] args) {
        int m = 3, n = 3;
        int dp[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }
        for (int i = 0; i < n; i++) {
            dp[0][i] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
            }
        }
        utils.utils.printarr(dp);
    }
}
