package BS.MT;

import java.util.Scanner;

/**
 * Created by lenovo on 20/9/6.
 */
public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int arr[] = new int[len];

        int b[] = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = scanner.nextInt();
            b[i] = yihuo(arr[i], len, i + 1);
        }

        int res = b[0] ^ b[1];
        for (int i = 2; i < len; i++) {
            res ^= b[i];
        }
        System.out.println(res);
    }

    public static int yihuo(int arr, int len, int ind) {
        int res = arr ^ (ind % 1);
        for (int i = 1; i <= len; i++) {
            if (i == 1) {

            } else {
                res ^= ind % i;
            }
        }
        return res;

    }

}
