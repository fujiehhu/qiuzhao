package HJ;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by fujie on 20/8/21.
 */
public class 字符串分割 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<StringBuilder> list = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            process(scanner.nextLine(), list);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }

    public static void process(String string, ArrayList list) {
        if (string.length() <= 8) {
            StringBuffer res = new StringBuffer(string);
            for (int i = string.length(); i < 8; i++) {
                res.append("0");
            }
            list.add(res);
        } else {
            StringBuffer res = new StringBuffer();
            int i = 0, c = 0;
            for (; i < 8 && c < string.length(); i++, c++) {
                res.append(string.charAt(c));
                if (i == 7) {
                    i = -1;
                    list.add(res);
                    res = new StringBuffer();
                }


            }
            if (i > 0)
                for (; i < 8; i++) {
                    res.append("0");
                }
            list.add(res);
        }
    }
}
