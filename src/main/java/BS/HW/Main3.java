package BS.HW;

import java.util.Scanner;

/**
 * Created by lenovo on 20/9/2.
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int n = sc.nextInt();
        int[] weight = new int[n];
        int[] value = new int[n];
        sc.nextLine();
        String strw = sc.nextLine();
        String strv = sc.nextLine();
        String[] splitw = strw.split(" ");
        String[] splitv = strv.split(" ");
        for (int i = 0; i < n; i++) {
            weight[i] = Integer.valueOf(splitw[i]);
            value[i] = Integer.valueOf(splitv[i]);
        }
        int res = maxValue(n, target, weight, value);
        System.out.println(res);
    }
    public static int maxValue(int n, int target, int[] w, int[] v) {
        int[][] arr = new int[n][target + 1];
        for (int i = 0; i <= target; i++) {
            if (i >= w[0]) {
                arr[0][i] = v[0];
            }
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= target; j++) {
                if (j < w[i])
                    arr[i][j] = arr[i - 1][j];
                else
                    arr[i][j] = Math.max(arr[i - 1][j], arr[i - 1][j - w[i]] + v[i]);
            }
        }
        return arr[n - 1][target];
    }
}
