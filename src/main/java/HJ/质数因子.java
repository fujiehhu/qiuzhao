package HJ;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by fujie on 20/8/21.
 */
public class 质数因子 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();
        //long num = 180;
        ArrayList<String> list = new ArrayList<>();
        int i = 2;
        while (true) {
            if (num % i == 0) {
                list.add(String.valueOf(i) + " ");
                num = num / i;
            } else
                i++;
            if (num == 1) {
                break;
            }
        }
        for (int j = 0; j < list.size(); j++) {
            String s = list.get(j);
            System.out.print(s);
        }
    }
}
