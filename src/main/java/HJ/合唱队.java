package HJ;

import java.util.Scanner;

/**
 * Created by fujie on 20/9/7.
 */
public class 合唱队 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            int N = Integer.valueOf(scanner.nextLine());
            String[] heis = scanner.nextLine().split(" ");
            int[] height = new int[N];
            for (int i = 0; i < N; ++i) {
                height[i] = Integer.valueOf(heis[i]);
            }
            System.out.println(height);

        }
    }
}
