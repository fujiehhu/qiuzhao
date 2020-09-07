package OT;

/**
 * Created by fujie on 20/9/7.
 */
public class 最长上升子序列 {
    //DP
    public static void main(String[] args) {
        int arr[] = {4, 5, 7, 7, 1, 3, 9};
        dp(arr);
    }

    public static void dp(int arr[]) {
        int dp[] = new int[arr.length];
        //dp初始化
        for (int i = 0; i < arr.length; i++) {
            dp[i] = 1;
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] >= dp[i] && arr[j] <= arr[i]) {
                    dp[i] = dp[j] + 1;
                }
            }
        }
        System.out.println(dp);
    }
}
