package HJ;

import java.security.Signature;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by fujie on 20/9/9.
 */
public class 整型数组排序 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = Integer.parseInt(scanner.nextLine());
            String s = scanner.nextLine();
            String sort = scanner.nextLine();
            String[] split = s.split(" ");
            ArrayList<String> list = new ArrayList<>();
            for (int i = 0; i < split.length; i++) {
                list.add(split[i]);
            }
            Collections.sort(list, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    if (sort.equals("0")) {
                        return Integer.valueOf(o1) - Integer.valueOf(o2);
                    } else {
                        return Integer.valueOf(o2) - Integer.valueOf(o1);
                    }
                }
            });
            for (int i = 0; i < list.size(); i++) {
                String s1 = list.get(i);
                System.out.print(s1 + " ");
            }
            System.out.println();

        }

    }
}
