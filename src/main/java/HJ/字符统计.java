package HJ;

import java.util.*;

/**
 * Created by fujie on 20/9/9.
 */
public class 字符统计 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            HashMap<String, Integer> map = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                map.put(s.charAt(i) + "", map.getOrDefault(s.charAt(i) + "", 0) + 1);
            }
            Set<Map.Entry<String, Integer>> entries = map.entrySet();
            ArrayList<Map.Entry<String, Integer>> list = new ArrayList<>(entries);
            LinkedHashMap<String, Integer> hashMap = new LinkedHashMap<>();
            Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
                @Override
                public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                    if (o1.getValue() != o2.getValue()) {
                        return o2.getValue() - o1.getValue();
                    } else {
                        return o1.getKey().compareTo(o2.getKey());
                    }
                }
            });
            for (int i = 0; i < list.size(); i++) {
                Map.Entry<String, Integer> entry = list.get(i);
                System.out.print(entry.getKey());
            }
            System.out.println();
        }


    }
}
