package LC.STRING;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by fujie on 20/7/26.
 */
public class 隐藏个人信息 {
    /*
    *输入: "LeetCode@LeetCode.com"
    输出: "l*****e@leetcode.com"
    解释：
    所有的名称转换成小写, 第一个名称的第一个字符和最后一个字符中间由 5 个星号代替。
    因此，"leetcode" -> "l*****e"。
    *
    *
    * */
    public static void main(String[] args) {
        maskPII("d@e.com");
    }

    public static String maskPII(String S) {
        S = S.toLowerCase();
        String mail = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";

        Pattern rmail = Pattern.compile(mail);
        Matcher mmail = rmail.matcher(S);

        String result = "";
        //邮箱
        if (mmail.matches()) {
            if (S.length() < 8) {
                return S;
            }
            System.out.println("加密邮箱");
            String first = String.valueOf(S.charAt(0));
            int i = 0;
            while (S.charAt(i + 1) != '@') {
                i++;
            }
            if (i < 1) {
                return S;
            }
            String last = String.valueOf(S.charAt(i));
            String remain = S.substring(i + 1);
            String newhead = first + "*****" + last;
            result = newhead + remain;
        } else {
            //电话
            //取出数字
            if (S.length() < 10) {
                return S;
            }
            StringBuilder sb = new StringBuilder(S);

            int i = 0;
            while (i < sb.length()) {
                if (sb.charAt(i) >= '0' && sb.charAt(i) <= '9') {
                    i++;
                } else {
                    sb.deleteCharAt(i);
                }
            }
            String last = sb.substring(sb.length() - 4);
            if (sb.length() > 10) {
                if (sb.length() == 11) {
                    result = "+*-***-***-" + last;
                } else if (sb.length() == 12) {
                    result = "+**-***-***-" + last;
                } else {
                    result = "+***-***-***-" + last;
                }
            } else {
                result = "***-***-" + last;
            }

        }
        System.out.println(result);
        return result;
    }
}
