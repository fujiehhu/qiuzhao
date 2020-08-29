package BS.MT;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by fujie on 20/8/29.
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int res = 0;
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();

        }
        for (int i =1; i <= m; i++) {
            for (int j = 1; j <= m; j++) {
                if (ismoqi(array, i, j, m)) {
                    res++;
                }
            }

        }
        System.out.println(res);
    }

    public static boolean ismoqi(int[] array, int l, int r, int m) {
        if (l > r) {
            return false;
        }
        int len = array.length;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            int x = array[i];
            if ((x > 0 && x < l) || (x > r && x < m + 1)) {
                list.add(x);
            }

        }
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                return false;
            }

        }
        return true;
    }
}
