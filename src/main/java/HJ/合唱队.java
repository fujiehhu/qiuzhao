package HJ;

import java.util.Scanner;

/**
 * Created by fujie on 20/9/7.
 */
public class 合唱队 {
    //动态规划
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            int N = Integer.valueOf(scanner.nextLine());
            String[] heis = scanner.nextLine().split(" ");
            int[] height = new int[N];
            for (int i = 0; i < N; ++i) {
                height[i] = Integer.valueOf(heis[i]);
            }
            //从前到后每个位置的递增子序列长度
            int dpf[] = new int[N];
            for (int i = 0; i < height.length; i++) {
                dpf[i] = 1;
                for (int j = 0; j < i; j++) {
                    if (dpf[j] >= dpf[i] && height[j] < height[i]) {
                        dpf[i] = dpf[j] + 1;
                    }
                }
            }
            int dpl[] = new int[N];
            for (int i = height.length - 1; i > 0; i--) {
                dpl[i] = 1;
                for (int j = height.length - 1; j > i; j--) {
                    if (dpl[j] >= dpl[i] && height[j] < height[i]) {
                        dpl[i] = dpl[j] + 1;
                    }
                }
            }
            int max = -1;
            for (int i = 0; i < N; i++) {
                max = Math.max(max, dpf[i] + dpl[i] - 1);
            }

            System.out.println(N-max);

        }
    }
}
