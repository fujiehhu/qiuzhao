package LC;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fujie on 20/7/26.
 */
public class 复原IP地址 {
//    给定一个只包含数字的字符串，复原它并返回所有可能的 IP 地址格式。
//    有效的 IP 地址正好由四个整数（每个整数位于 0 到 255 之间组成），整数之间用 '.' 分隔。

    //    输入: "25525511135"
//    输出: ["255.255.11.135", "255.255.111.35"]

    //    回溯
    public static void main(String[] args) {
        restoreIpAddresses("1111");
    }

    public static List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();

        // 1.1.1.11
        if (s.length() == 4) {
            result.add("\""+s.charAt(0) + "." + s.charAt(1) + "." + s.charAt(2) + "." + s.charAt(3)+"\"");
        }

        System.out.println(result);
        return result;

    }
}
