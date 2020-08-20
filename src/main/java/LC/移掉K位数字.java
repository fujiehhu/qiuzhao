package LC;

import java.util.Stack;

/**
 * Created by fujie on 20/8/11.
 */
public class 移掉K位数字 {
    public static void main(String[] args) {
        String string = "1432219";
        int k = 7;
        System.out.println(removeKdigits(string, k));

    }

    public static String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>();
        if (num.length() == k) {
            return "0";
        }

        return "";
    }
}
