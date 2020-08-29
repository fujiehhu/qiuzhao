package BS.JD;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by fujie on 20/8/27.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        if (k < 0) {
            System.out.println("0");
        }
        int val = 0;
        Queue<Integer> qu2 = new LinkedList<>();
        Queue<Integer> qu3 = new LinkedList<>();
        Queue<Integer> qu5 = new LinkedList<>();
        qu2.add(1);
        for (int i = 0; i <= k; i++) {
            int v2 = qu2.size() > 0 ? qu2.peek() : Integer.MAX_VALUE;
            int v3 = qu3.size() > 0 ? qu3.peek() : Integer.MAX_VALUE;
            int v5 = qu5.size() > 0 ? qu5.peek() : Integer.MAX_VALUE;
            val = Math.min(v2, Math.min(v2, v3));
            if (val == v2) {
                qu2.remove();
                qu2.add(2 * val);
                qu3.add(3 * val);
                qu5.add(5 * val);
            } else if (val == v3) {
                qu3.remove();
                qu3.add(3 * val);
                qu5.add(5 * val);
            } else {
                qu5.remove();
                qu5.add(5 * val);
            }

        }
        System.out.println(val);

    }
}
