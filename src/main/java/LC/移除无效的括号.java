package LC;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by lenovo on 20/7/26.
 */
public class 移除无效的括号 {
//    给你一个由 '('、')' 和小写字母组成的字符串 s。
//
//    你需要从字符串中删除最少数目的 '(' 或者 ')' （可以删除任意位置的括号)，使得剩下的「括号字符串」有效。
//
//    请返回任意一个合法字符串。
//
//    有效「括号字符串」应当符合以下 任意一条 要求：
//
//    空字符串或只包含小写字母的字符串
//    可以被写作 AB（A 连接 B）的字符串，其中 A 和 B 都是有效「括号字符串」
//    可以被写作 (A) 的字符串，其中 A 是一个有效的「括号字符串」


    public static void main(String[] args) {
        minRemoveToMakeValid("lee(t(c)o)de)");
    }

    public static String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder(s);
        Stack<String> stack = new Stack<>();
        List<Integer> right = new ArrayList<>();//需要移除的位置
        List<Integer> left = new ArrayList<>();//需要移除的位置
        int i = 0;
        while (i < s.length()) {
            //栈空 有右括号
            if (stack.size() == 0 && s.charAt(i) == ')') {
                right.add(i);
            } else if (s.charAt(i) == ')') {
                stack.pop();
                left.remove(0);
            } else if (s.charAt(i) == '(') {
                stack.push("(");
                left.add(i);
            }
            i++;
        }
        // 多余括号标记
        if (left.size() != 0) {
            i = 0;
            while (i < left.size()) {
                sb.setCharAt(left.get(i), '0');
                i++;
            }
        }
        if (right.size() != 0) {
            i = 0;
            while (i < right.size()) {
                sb.setCharAt(right.get(i), '0');
                i++;
            }
        }
        StringBuilder res = new StringBuilder();
        i = 0;
        while (i < sb.length()) {
            if (sb.charAt(i) != '0') {
                res.append(sb.charAt(i));
            }
            i++;
        }
        System.out.println(res.toString());
        return res.toString();
    }
}
