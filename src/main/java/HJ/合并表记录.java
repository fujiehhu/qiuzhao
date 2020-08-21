package HJ;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by fujie on 20/8/21.
 */
public class 合并表记录 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();

        for (int i = 0; i < num; i++) {
            int key = scanner.nextInt();
            int val = scanner.nextInt();
            treeMap.put(key, treeMap.get(key) == null ? val : treeMap.get(key) + val);
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
