package HJ;

import javax.lang.model.element.VariableElement;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by fujie on 20/9/9.
 */
public class _24点运算 {
    static HashMap<String, Integer> map = new HashMap<String, Integer>();
    static StringBuilder path = new StringBuilder();

    static void init() {
        map.put("J", 11);
        map.put("Q", 12);
        map.put("K", 13);
        map.put("A", 1);
        map.put("joker", 14);
        map.put("JOKER", 14);
        map.put("2", 2);
        map.put("3", 3);
        map.put("4", 4);
        map.put("5", 5);
        map.put("6", 6);
        map.put("7", 7);
        map.put("8", 8);
        map.put("9", 9);
        map.put("10", 10);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        init();
        loop:
        while (scanner.hasNextLine()) {
            String arrs[] = new String[4];
            int arr[] = new int[4];
            int isused[] = new int[4];
            String nums = scanner.nextLine();

            for (int i = 0; i < 4; i++) {
                arrs[i] = nums.split(" ")[i];
                if (!map.containsKey(arr[i]) || map.get(arrs[i]) == 14) {
                    System.out.println("ERROR");
                    continue loop;
                } else {
                    arr[i] = map.get(arrs[i]);
                }

            }

            if (dfs(0, isused, arr)) System.out.println(path.deleteCharAt(path.length() - 1));
            else System.out.println("NONE");
            path = new StringBuilder();
        }

    }

    public static boolean dfs(int x, int isused[], int arr[]) {
        boolean ed = true;
        //看四个数是否用完
        for (int i = 0; i < isused.length; i++) {
            if (isused[i] == 0) {
                ed = false;
                break;
            }
        }
        if (ed) {
            if (x == 24) {
                return true;
            } else {
                return false;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (isused[i] == 0) {
                isused[i] = 1;
                if (dfs(x + arr[i], isused, arr)) {
                    path.append(getOri(arr[i]) + "+");
                    return true;
                }
                if (dfs(x - arr[i], isused, arr)) {
                    path.append(getOri(arr[i]) + "-");
                    return true;
                }
                if (dfs(x * arr[i], isused, arr)) {
                    path.append(getOri(arr[i]) + "*");
                    return true;
                }
                if (x % arr[i] == 0 && dfs(x / arr[i], isused, arr)) {
                    path.append("/" + getOri(arr[i]));
                    return true;
                }
                isused[i] = 0;//回退
            }
        }
        return false;
    }

    static String getOri(int x) {
        String res = "";
        for (Map.Entry<String, Integer> m : map.entrySet()) {
            if (m.getValue() == x) {
                res = m.getKey();
            }
        }
        return res;
    }
}
