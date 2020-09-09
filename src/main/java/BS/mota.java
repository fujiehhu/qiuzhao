package BS;

/**
 * Created by lenovo on 20/9/7.
 */
public class mota {
    public static void main(String[] args) {
        int n = 2;
        int a[] = {6, 5, 0, 8, 9};
        int b[] = {1, 20, 0, 1, 0};
        int dp[] = new int[n + n + 1];
        int st = dp.length / 2;
        dp[st] = 100;
        int i = 1;
        while (i <= 4) {
            if (i == 1) {
                dp[st - i] = dp[st] - b[st - i] + a[st - i];//zuo
                dp[st + i] = dp[st] - b[st + i] + a[st + i];//右
            } else {
                if (dp[st + i + 1] == 0) {
                    for (int j = 0; j < st - i; j++) {
                        if (dp[j] > dp[st - i]) {
                            dp[j] = dp[st - i];
                        }
                    }
                }
                if (dp[st - i - 1] == 0) {
                    for (int j = dp.length - 1; j > st - i; j--) {
                        if (dp[j] > dp[st - i]) {
                            dp[j] = dp[st - i];
                        }
                    }
                }

            }
            i++;

        }
    }
}
