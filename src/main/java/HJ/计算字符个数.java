package HJ;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by fujie on 20/8/20.
 */
public class 计算字符个数 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String tar = scanner.nextLine();
        System.out.println(num(s, tar.charAt(0)));
    }

    public static int num(String s, Character tar) {
        s = s.toLowerCase();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); ++i) {
            map.put(s.charAt(i), map.get(s.charAt(i)) == null ? 1 : map.get(s.charAt(i)) + 1);
        }
        return map.get(tar) == null ? 0 : map.get(tar);
    }
}
