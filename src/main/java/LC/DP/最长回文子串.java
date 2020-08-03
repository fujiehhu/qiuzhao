package LC.DP;

/**
 * Created by fujie on 20/8/3.
 */
public class 最长回文子串 {
    //给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
    //示例 1：
    //输入: "babad"
    //输出: "bab"
    //注意: "aba" 也是一个有效答案。

    // ** 重点是找到状态转移方程 **
    public static void main(String[] args) {
        longestPalindrome("babad");
    }

    public static String longestPalindrome(String s) {
        // 特判
        int len = s.length();
        if (len < 2) {
            return s;
        }

        int maxLen = 1;
        int begin = 0;

        // dp[i][j] 表示 s[i, j] 是否是回文串
        boolean[][] dp = new boolean[len][len];
        char[] charArray = s.toCharArray();

        for (int i = 0; i < len; i++) {
            dp[i][i] = true;
        }
        utils.utils.printarr(dp);
        System.out.println();
        for (int j = 1; j < len; j++) { //列
            for (int i = 0; i < j; i++) {//行
                if (charArray[i] != charArray[j]) {
                    dp[i][j] = false;
                } else {
                    if (j - i < 3) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                }
                // 只要 dp[i][j] == true 成立，就表示子串 s[i..j] 是回文，此时记录回文长度和起始位置
                if (dp[i][j] && j - i + 1 > maxLen) {
                    maxLen = j - i + 1;
                    begin = i;
                }
            }
        }
        utils.utils.printarr(dp);
        return s.substring(begin, begin + maxLen);

    }
}
