package HJ;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by fujie on 20/8/21.
 */
public class 提取不重复的整数 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        StringBuilder s = new StringBuilder(num + "");
        StringBuilder res = new StringBuilder( );
        s.reverse();
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); ++i) {
            if (!set.contains(s.charAt(i))) {
                res.append(s.charAt(i));
                set.add(s.charAt(i));
            }
        }
        System.out.println(Integer.parseInt(res.toString()));
    }
}
