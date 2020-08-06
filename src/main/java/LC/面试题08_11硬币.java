package LC;

/**
 * Created by fujie on 20/8/5.
 */
public class 面试题08_11硬币 {
    //硬币。给定数量不限的硬币，币值为25分、10分、5分和1分，
    // 编写代码计算n分有几种表示法。(结果可能会很大，你需要将结果模上1000000007)

    //示例1:
    //输入: n = 5
    //输出：2
    //解释: 有两种方式可以凑成总金额:
    // 5=5
    // 5=1+1+1+1+1
    public static void main(String[] args) {
        System.out.println(waysToChange(35));
    }

    public static int waysToChange(int n) {

        if (n < 0) return 0;
        if (n == 1) return 1;

        int[] coins = new int[]{1, 5, 10, 25};
        int dp[] = new int[n + 1];
        dp[0] = 1;
        for (int coin : coins) {
            for (int i = coin; i <= n; i++) {
                dp[i] = (dp[i] + dp[i - coin]) % 1000000007;
            }
        }

        utils.utils.printarr(dp);
        System.out.println();
        return dp[n  ];
    }
}
