package ZZ;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Created by fujie on 20/8/24.
 */
public class 坐标移动 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        String s = scanner.nextLine();
//        String s = "S0;";
        while (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            String[] arr = s.split(";");//以；分割，然后匹配
            ArrayList<String> arrayList = new ArrayList<>();
            String pattern = "[A|S|D|W][0-9]{1,2}";
            for (String content : arr) {
                if (Pattern.matches(pattern, content))
                    arrayList.add(content);
            }
            int x = 0, y = 0;
            for (int i = 0; i < arrayList.size(); i++) {
                String s1 = arrayList.get(i);
                if (s1.charAt(0) == 'A') {
                    x -= Integer.parseInt(s1.substring(1));
                }
                if (s1.charAt(0) == 'D') {
                    x += Integer.parseInt(s1.substring(1));
                }

                if (s1.charAt(0) == 'S') {
                    y -= Integer.parseInt(s1.substring(1));
                }
                if (s1.charAt(0) == 'W') {
                    y += Integer.parseInt(s1.substring(1));
                }
            }
            System.out.println(x + "," + y);
        }
    }
}
