package HJ;

import java.util.Scanner;

/**
 * Created by fujie on 20/9/9.
 */
public class 多线程 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()){
            int n = scanner.nextInt();
            for (int i = 0; i < n; i++) {
                System.out.print("ABCD");
            }
            System.out.println();
        }

    }
}
