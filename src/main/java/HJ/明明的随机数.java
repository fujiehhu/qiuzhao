package HJ;

import java.util.*;

/**
 * Created by fujie on 20/8/20.
 */
public class 明明的随机数 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            int arr[] = new int[num];
            for (int i = 0; i < num; i++) {
                arr[i] = scanner.nextInt();
            }
            for (Integer c : process(arr)) {
                System.out.println(c);
            }
        }

    }

    public static TreeSet<Integer> process(int[] arr) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < arr.length; i++) {
            treeSet.add(arr[i]);
        }
        return treeSet;
    }
}
