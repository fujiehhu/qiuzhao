package HJ;

import java.util.Scanner;

/**
 * Created by fujie on 20/8/22.
 */
public class 求int型正整数在内存中1的个数 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int s = 0;
        while (num != 0) {
            if (num % 2 == 1)
                s++;
            num = num / 2;
        }
        System.out.println(s);
    }
}
