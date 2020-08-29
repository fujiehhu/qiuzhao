package BS.MT;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by fujie on 20/8/29.
 */
public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int A[] = new int[n];
        int B[] = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
            B[i] = -1;
        }
        int opt = scanner.nextInt();
        ArrayList<List<Integer>> list = new ArrayList<>();
        scanner.nextLine();
        for (int i = 0; i < opt; i++) {
            ArrayList<Integer> integers = new ArrayList<>();
            //integers.add(scanner.nextInt());
            String str = scanner.nextLine();
            String[] strings = str.split(" ");
            for (int j = 0; j < strings.length; j++) {
                if (strings[j].trim().length() == 0)
                    continue;
                integers.add(Integer.parseInt(strings[j]));
            }
            //list.add(integers);
            //for (int ii = 0; ii < integers.size(); ii++) {
            //chuli;
            int opti = integers.get(0);
            if (opti == 1) {//
                int k = integers.get(1);
                int x = integers.get(2);
                int y = integers.get(3);
                x--;
                y--;
                if (y + k <= B.length) {
                    for (int j = x; j < x + k; j++) {
                        B[y++] = A[j];
                    }
                } else {
                    //buhefa
                }
            }
            if (opti == 2) {//
                System.out.println(B[integers.get(1) - 1]);
            }

            //}
        }

        //System.out.println(list);

    }
}
