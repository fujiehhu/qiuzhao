package BS.MT;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by fujie on 20/8/29.
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < n - 1; i++) {
            int tmp[] = new int[2];
            tmp[0] = scanner.nextInt();
            tmp[1] = scanner.nextInt();
            list.add(tmp);
        }
        System.out.println(list);
    }
}
