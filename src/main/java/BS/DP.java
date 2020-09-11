package BS;

import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Created by fujie on 20/9/9.
 */
public class DP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nc = scanner.nextLine();
        int n = Integer.valueOf(nc.split(" ")[0]);
        int c = Integer.valueOf(nc.split(" ")[1]);
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            String s = scanner.nextLine();
            arr[i][0] = Integer.valueOf(s.split(" ")[0]);
            arr[i][1] = Integer.valueOf(s.split(" ")[0]);
        }
        float dp[][] = new float[n + 1][c + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= c; j++) {
                if (arr[i - 1][0] <= j) {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - arr[i - 1][0]] + arr[i - 1][1]);
                }
            }
        }
        System.out.println(dp[n][c]);
    }
}

 