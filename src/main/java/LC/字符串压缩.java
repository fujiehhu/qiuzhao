package LC;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fujie on 20/7/26.
 */
public class 字符串压缩 {
//    字符串压缩。利用字符重复出现的次数，编写一种方法，实现基本的字符串压缩功能。
//    比如，字符串aabcccccaaa会变为a2b1c5a3。若“压缩”后的字符串没有变短，
//    则返回原先的字符串。你可以假设字符串中只包含大小写英文字母（a至z）。

//    输入："aabcccccaaa"
//    输出："a2b1c5a3"

    public static void main(String[] args) {
        compressString("aabcccccaaa");
    }

    public static String compressString(String S) {

        int i = 0;
        char tmp = S.charAt(0);
        StringBuilder sb = new StringBuilder();
        int count = 0;
        while (i < S.length()) {
            if (S.charAt(i) == tmp) {
                count++;
            } else {
                sb.append(tmp);
                sb.append(count);
                count = 1;
                tmp = S.charAt(i);
            }
            i++;
        }
        sb.append(tmp);
        sb.append(count);
        System.out.println(sb);
        return sb.toString();
    }

    public String get(String S) {
        if (S.length() == 0) {
            return "";
        }
        int len = 0;
        List ls = new ArrayList<>();
        ls.add(S.charAt(0));
        ls.add(0);
        int t = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == (char) ls.get(t)) {
                len++;
                ls.remove(ls.size() - 1);
                ls.add(len);

            } else {
                t += 2;
                len = 1;
                ls.add(S.charAt(i));
                ls.add(1);
            }
        }
        String rr = "";
        for (Object o : ls) {
            rr += o;
        }


        return rr.length() < S.length() ? rr : S;
    }
}
