package BS.FH;

import java.util.Scanner;

/**
 * Created by lenovo on 20/8/29.
 */
public class Mian1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        int len1 = str1.length();
        int len2 = str2.length();
        int index1 = 0, index2 = 0;
        StringBuilder sb = new StringBuilder();
        while (index1 < len1 - 1 && index2 < len2 - 1) {
            char a = str1.charAt(index1);
            char b = str2.charAt(index2);
            if (a < b) {
                sb.append(a);
                ++index1;
            } else {
                sb.append(b);
                index2++;
            }
        }
        if (index1 < len1 - 1) sb.append(str1.substring(index1, len1 - 1));
        if (index2 < len2 - 1) sb.append(str2.substring(index2, len2 - 1));
        if (str1.charAt(len1 - 1) < str2.charAt(len2 - 1)) {
            sb.append(str1.charAt(len1 - 1));
            sb.append(str2.charAt(len2 - 1));
        } else {
            sb.append(str2.charAt(len2 - 1));
            sb.append(str1.charAt(len1 - 1));
        }
        System.out.println(sb.toString());

    }
}