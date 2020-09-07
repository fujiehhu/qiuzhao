package BS.XHS;

import java.util.Arrays;

/**
 * Created by lenovo on 20/9/6.
 */
public class main1 {
    public static void main(String[] args) {
        int arr[][] = {{3, 1, 4}, {5, 8, 10}};
        System.out.println(findMin(arr));
    }

    static int findMin(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        int num[] = new int[row * col];
        int ind = 0;
        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < col; j++) {
                num[ind++] = arr[i][j];
            }
        }
        Arrays.sort(num);
        int res = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] != i + 1) {
                res = i + 1;
                break;
            }
        }
        return res;
    }
}
