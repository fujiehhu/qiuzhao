package HJ;

import javax.swing.text.html.CSS;
import java.util.*;

/**
 * Created by fujie on 20/9/7.
 */
public class 删除字符串中出现次数最少的字符 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            int cnt = 999;
            HashMap<String, Integer> map = new HashMap<>();
            for (int i = 0; i < input.length(); i++) {
                map.put(input.charAt(i) + "", map.getOrDefault(input.charAt(i) + "", 0) + 1);
            }
            HashSet<String> set = new HashSet<>();
            for (Map.Entry<String, Integer> m : map.entrySet()) {
                if (m.getValue() < cnt) {
                    if (set.size() != 0) set.clear();
                    set.add(m.getKey());
                    cnt = m.getValue();
                } else if (m.getValue() == cnt) {
                    set.add(m.getKey());
                }
            }
            String res = "";
            for (int i = 0; i < input.length(); i++) {
                if (!set.contains(input.charAt(i) + "")) {
                    res += input.charAt(i);
                }
            }
            System.out.println(res);
        }
    }
}
