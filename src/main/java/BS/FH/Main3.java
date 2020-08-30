package BS.FH;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Created by lenovo on 20/8/29.
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        String res = "";
        while (A > 0 || B > 0) {
            int a = A % 10;
            int b = B % 10;
            if (A == 0) {
                res = b + res;
                B /= 10;
            } else if (B == 0) {
                res = a + res;
                A /= 10;
            } else if (a > b) {
                res = a + res;
                B /= 10;
            } else if (a < b) {
                res = b + res;
                B /= 10;
            } else if (a == b) {
                if (A / 10 % 10 < B / 10 % 10) {
                    res =b+res;
                    B/=10;
                }else {
                    res = a + res;
                    A /= 10;
                }

            }
        }
        System.out.println(res);
    }
}
