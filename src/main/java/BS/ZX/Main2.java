package BS.ZX;

import javax.swing.text.html.CSS;
import java.util.Scanner;

/**
 * Created by lenovo on 20/8/31.
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {


            int n = scanner.nextInt();
            for (int i = 0; i < n; i++) {
                int len = scanner.nextInt();
                int num[] = new int[len];
                for (int j = 0; j < len; j++) {
                    num[j] = scanner.nextInt();
                }
                int d = num[len - 1] - num[0];
                int dmax = d + 2;
                int dmin = d - 2;
                int ans = Integer.MAX_VALUE;
                for (d = dmin; d <= dmax; d++) {
                    int res = 0;
                    if (d % (len - 1) != 0) {
                        continue;
                    }
                    int index = d / (len - 1);
                    for (int k = 1; k < len; k++) {
                        res = res + num[k] - num[0] - k * index;
                    }
                    ans = Math.min(ans, res);
                }
                System.out.println(ans);
            }
        }
    }
}
