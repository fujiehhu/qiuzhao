package HJ;

import java.util.Scanner;

/**
 * Created by fujie on 20/9/9.
 */
public class 等差数列 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            if (n < 1) {
                System.out.println("-1");
                continue;
            }
            int res = (2 + 3 * n - 1) * n / 2;
            System.out.println(res);
        }
    }
}


