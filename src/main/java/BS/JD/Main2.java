package BS.JD;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by lenovo on 20/8/27.
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            String[] s = {"2", "3", "5"};
            int index = 1;
            int sum = (int) (Math.pow(3, index + 1) - 3) / 2;
            while (sum < n) {
                index++;
                sum = (int) (Math.pow(3, index + 1) - 3) / 2;
            }
            index--;
            int cur = n - (int) (Math.pow(3, index + 1) - 3) / 2;
            List<String> strings = new ArrayList<>();
            dfs(s, "", 0, index + 1, strings);
            System.out.println(strings.get(cur - 1));
        }
    }

    public static void dfs(String[] s, String str, int cur, int len, List<String> list) {
        if (cur == len) {
            list.add(str);
            return;
        }
        for (int i = 0; i < 3; i++) {
            str = str + s[i];
            dfs(s, str, cur + 1, len, list);
            str = str.substring(0, str.length() - 1);

        }
        return;
    }
}
