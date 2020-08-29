package BS.JD;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by lenovo on 20/8/27.
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        ArrayList<String> list = new ArrayList<>();
        int nums[] = new int[n * n];
        for (int i = 0; i < n * n; i++) {
            nums[i] = scanner.nextInt();
        }
        for (int i = 0; i < n * n; i++) {
            if (nums[3 * i + 1] + nums[i] >= nums[3 * i + 1])
                nums[3 * i + 1] = nums[3 * i + 1] + nums[i];
            if (nums[3 * i + 2] + nums[i] >= nums[3 * i + 2])
                nums[3 * i + 2] = nums[3 * i + 2] + nums[i];
            if (nums[3 * i + 3] + nums[i] >= nums[3 * i + 3])
                nums[3 * i + 3] = nums[3 * i + 3] + nums[i];
        }
        int max = 0;
        for (int i = 2 * (n - 1); i < n * n; i++) {
            max = nums[i] > max ? nums[i] : max;
        }
        System.out.println(max);
    }
}
