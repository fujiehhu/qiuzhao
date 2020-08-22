package HJ;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by fujie on 20/8/21.
 */
public class 字符个数统计 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
           set.add(s.charAt(i));

        }
        System.out.println(set.size());
    }
}
