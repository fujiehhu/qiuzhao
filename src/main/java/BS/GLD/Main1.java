package BS.GLD;

import com.sun.webkit.event.WCChangeEvent;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by lenovo on 20/8/26.
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        int[] data = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
            data[i] = nums[i];
        }
        Arrays.sort(data);
        int p = n - 1;
        int q = n - 1;
        while (p >= 0 && q >= 0) {
            if (nums[p] == data[q]) {
                p--;
                q--;
            } else {
                while (p >= 0 && nums[p] != data[q]) {
                    p--;
                }
            }

        }
        System.out.println(q + 1);
    }
}
