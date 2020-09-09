package HJ;

import java.util.Scanner;

/**
 * Created by fujie on 20/9/8.
 */
public class 购物单 {
    //dp 未通过
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String Nm = scanner.nextLine();
//        int N = Integer.valueOf(Nm.split(" ")[0]);
//        int m = Integer.valueOf(Nm.split(" ")[1]);
//        int arr[][] = new int[m][3];
//        for (int i = 0; i < m; i++) {
//            String vpq = scanner.nextLine();
//            arr[i][0] = Integer.valueOf(vpq.split(" ")[0]);
//            arr[i][1] = Integer.valueOf(vpq.split(" ")[1]);
//            arr[i][2] = Integer.valueOf(vpq.split(" ")[2]);
//        }
        int m = 7;
        int N = 1500;

        int arr[][] = {
                {500, 1, 0}, {400, 4, 0}, {300, 5, 1}, {400, 5, 1}, {200, 5, 0}, {500, 4, 0}, {400, 4, 0}
        };
        int[] v = new int[m + 1];
        int[] p = new int[m + 1];
        int[] q = new int[m + 1];
        int[][] res = new int[m + 1][N + 1];
        for (int i = 1; i <= m; i++) {
            v[i] = arr[i - 1][0];
            p[i] = arr[i - 1][1] * v[i];
            q[i] = arr[i - 1][2];
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= N; j++) {
                if (q[i] == 0) {
                    if (v[i] <= j) {
                        res[i][j] = Math.max(res[i - 1][j], res[i - 1][j - v[i]] + p[i]);
                    }
                } else {
                    if (v[i] + v[q[i]] <= j) {
                        res[i][j] = Math.max(res[i - 1][j], res[i - 1][j - v[i]] + p[i]);
                    }
                }
            }
        }
        System.out.println(res[m][N]);
//        System.out.println(max);
    }
}
