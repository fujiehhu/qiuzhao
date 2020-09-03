package BS.QAX;

import java.util.Scanner;

/**
 * Created by fujie on 20/9/2.
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(process(n));
    }

    public static int process(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else {
            return process(n - 1) + process(n - 2);
        }

    }

}
