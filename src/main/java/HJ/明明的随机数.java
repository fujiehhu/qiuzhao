package HJ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by fujie on 20/8/20.
 */
public class 明明的随机数 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int arr[] = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = scanner.nextInt();
        }
        for (Integer c : process(arr)) {
            System.out.println(c);
        }
    }

    public static List<Integer> process(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (!list.contains(arr[i])) {
                list.add(arr[i]);
            }
        }
        Collections.sort(list);

        return list;
    }
}
