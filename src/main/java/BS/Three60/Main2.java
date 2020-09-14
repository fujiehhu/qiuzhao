package BS.Three60;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by lenovo on 20/9/11.
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nm = scanner.nextLine();
        int n = Integer.valueOf(nm.split(" ")[0]);
        int m = Integer.valueOf(nm.split(" ")[1]);
        int arr[][] = new int[m][2];
        for (int i = 0; i < m; i++) {
            String num = scanner.nextLine();
            arr[i][0] = Integer.valueOf(num.split(" ")[0]);
            arr[i][1] = Integer.valueOf(num.split(" ")[1]);
        }
        int res[] = new int[n];
        for (int i = 0; i < m; i++) {
            res[arr[i][0] - 1] = 1;
        }
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (res[i] == 1) {
                cnt++;
            }
        }
        if (cnt > 1) {
            for (int i = 0; i < n; i++) {
                if (res[i] == 0) {
                    System.out.print(i + 1 + " ");
                }
            }
        } else {
            for (int i = 0; i < n; i++) {
                System.out.print(i + 1 + " ");
            }
        }
    }
}