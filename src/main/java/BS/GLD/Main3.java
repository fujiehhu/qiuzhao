package BS.GLD;

import java.util.Scanner;

/**
 * Created by lenovo on 20/8/26.
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();
        long d = scanner.nextLong();
        long k0 = (a + b + c + d) / 4;
        long sum = a + b + c + d;
        long res = 0;
        for (long k = k0; k >= 0; k--) {
            long left = sum - (4 * k);
            long right = 0;
            if (k - a > 0) {
                right += k - a;
            }
            if (k - b > 0) {
                right += k - b;
            }
            if (k - c > 0) {
                right += k - c;
            }
            if (k - d > 0) {
                right += k - d;
            }
            if (left >= right) {
                res = k * 4;
            }
            break;
        }
        if (res == 0) {
            res = -1;
        }
        System.out.println(res);
    }
}
