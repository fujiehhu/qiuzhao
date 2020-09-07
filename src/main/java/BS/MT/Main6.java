package BS.MT;

import java.util.Scanner;

/**
 * Created by lenovo on 20/9/6.
 */
public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            int flag[] = new int[n];
            int cnt[] = new int[n];
            for (int i = 0; i < n; i++) {
                if (arr[i] > 1) {
                    flag[i] = 1;
                    int sy = arr[i] - 1;
                    for (int j = 0; sy > 0; j++) {
                        if (flag[j] == 0) {
                            flag[j] = 1;
                            sy--;
                            cnt[i] += 1;
                        }
                    }
                    if ((isused(flag) & xiashu(cnt, arr))) {
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                }
            }
        }
    }

    public static boolean isused(int flag[]) {
        int cnt = 0;
        for (int i = 0; i < flag.length; i++) {
            if (flag[i] == 1) {
                cnt++;
            }
        }
        return cnt == flag.length;
    }

    public static boolean xiashu(int cnt[], int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 1 && cnt[i] < 2) {
                return false;
            }
        }
        return true;
    }

}
