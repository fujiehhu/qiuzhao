package HJ;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by fujie on 20/8/22.
 */
public class 字串的连接最长路径 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String rn = scanner.nextLine();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            list.add(scanner.nextLine());
        }

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int low, high;
                low = o1.length() <= o2.length() ? o1.length() : o2.length();
                high = low == o1.length() ? o2.length() : o1.length();
                //先按照首字符排序
                if ((o1.charAt(0) != o2.charAt(0))) {
                    return o1.charAt(0) - o2.charAt(0);
                }
                //首字符相同，依次向下比较
                for (int i = 0; i < low; ++i) {
                    if (o1.charAt(i) != o2.charAt(i))
                        return o1.charAt(i) - o2.charAt(i);
                }
                //前缀相同返回长度短的在前，如 AA,A 返回A，AA
                return o1.length() - o2.length();

            }
        });
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
