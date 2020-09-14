package BS.QS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by fujie on 20/9/12.
 */
public class main1 {
    static int res_num;
    static int res[] = new int[500];
    static int p = 0;
    static int k, d;
    static ArrayList<List<Integer>> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        k = scanner.nextInt();
        d = scanner.nextInt();
        rollNum(n);
        int cnt = 0;
        for (int i = 0; i < list.size(); i++) {
            List<Integer> integers = list.get(i);
            boolean flag = true;
            Collections.sort(integers);
            if (integers.get(integers.size() - 1) < d) flag = false;
            if (flag) {
                cnt++;
//                System.out.println(integers);
            }
        }

        System.out.println(cnt);
    }

    static void rollNum(int n) {
        if (n <= 0) { // 出口
            ArrayList<Integer> integers = new ArrayList<>();
            for (int i = 0; i < p; i++) {
                integers.add(res[i]);
//                System.out.print(res[i] + " ");
            }
            list.add(integers);
//            System.out.println();
            res_num++;
        }
        if (n <= k) {
            for (int i = 1; i <= n; i++) {
                res[p] = i;
                p++;
                rollNum(n - i);
                p--;
            }
        } else {
            for (int i = 1; i <= k; i++) {
                res[p] = i;
                p++;
                rollNum(n - i);
                p--;
            }
        }
    }
}
