package BS.Bl;

import java.util.ArrayList;

/**
 * Created by lenovo on 20/9/4.
 */
public class Main3 {
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        SpiralMatrix(arr);


    }

    public static int[] SpiralMatrix(int[][] matrix) {
        // write code here
        ArrayList<Integer> integers = new ArrayList<>();
        if (matrix == null || matrix.length == 0) {
            return new int[0];
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int i = 0;
        int cnt = (Math.min(m, n) + 1) / 2;
        while (i < cnt) {
            for (int j = i; j < n - i; j++) {
                integers.add(matrix[i][j]);
            }
            for (int j = i + 1; j < m - i; j++) {
                integers.add(matrix[j][n - 1 - i]);
            }
            for (int j = n - 1 - (i + 1); j >= i && (m - 1 - i != i); j--) {
                integers.add(matrix[m - 1 - i][j]);
            }
            for (int j = m - 1 - (i + 1); j >= i + 1 && (n - 1 - i) != i; j--) {
                integers.add(matrix[j][i]);
            }
            i++;
        }
//        System.out.println(integers);
        int res[] = new int[m * n];
        for (int j = 0; j < m * n; j++) {
            res[j] = integers.get(j);
        }
        return res;
    }
}
