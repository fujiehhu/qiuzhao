package BS.XC;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Created by fujie on 20/9/8.
 */
public class Main1 {
    static int length;
    static char[] chars;
    static HashSet<String> set = new HashSet<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String line = sc.nextLine();
        String tar = sc.nextLine();

        if (line.equals(tar)) {
            System.out.println(line);
        }

        chars = word.toCharArray();
        length = chars.length;
        permutation(length);
        //System.out.println(set);
        String[] split = line.split("[\\s|,]");
        String res = "";
        int st = 0;
        for (int i = 0; i < line.length(); i++) {
            if (Pattern.matches("[a-zA-Z]", line.charAt(i) + "")) {
                String tmp = line.substring(st);
                if (i == line.length() - 1) {
                    if (set.contains(tmp)) {
                        System.out.print(tar);
                    } else {
                        System.out.print(tmp);
                    }
                }
            } else {
                String tmp = line.substring(st, i);
                if (set.contains(tmp)) {
                    System.out.print(tar);
                } else {
                    System.out.print(tmp);
                }
                System.out.print(line.charAt(i));
                st = i + 1;
            }
        }


    }

    static void move(int n) {
        int p = length - n;
        char tmp = chars[p];
        int i = p + 1;
        for (; i < length; i++) {
            chars[i - 1] = chars[i];
        }
        chars[i - 1] = tmp;
    }

    static void permutation(int n) {
        if (n == 1) {
            String tmp = "";
            for (int i = 0; i < chars.length; i++) {
                tmp += chars[i];
            }
            //System.out.println(chars);
            set.add(tmp);
            return;
        }
        for (int i = 0; i < n; i++) {
            permutation(n - 1);
            move(n);
        }
    }
}
