package HJ;

import java.util.Scanner;

/**
 * Created by fujie on 20/9/9.
 */
public class _24点 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            int arr[] = new int[4];
            int isused[] = new int[4];
            String nums = scanner.nextLine();

            for (int i = 0; i < 4; i++) {
                arr[i] = Integer.parseInt(nums.split(" ")[i]);
            }
            if (dfs(0, isused, arr)) System.out.println("true");
            else System.out.println("false");
        }

    }

    public static boolean dfs(int x, int isused[], int arr[]) {
        boolean ed = true;
        //看四个数是否用完
        for (int i = 0; i < isused.length; i++) {
            if (isused[i] == 0) {
                ed = false;
                break;
            }
        }
        if (ed) {
            if (x == 24) {
                return true;
            } else {
                return false;
            }

        }
        for (int i = 0; i < arr.length; i++) {
            if (isused[i] == 0) {
                isused[i] = 1;
                if (dfs(x + arr[i], isused, arr)) return true;
                if (dfs(x - arr[i], isused, arr)) return true;
                if (dfs(x * arr[i], isused, arr)) return true;
                if (x % arr[i] == 0 && dfs(x / arr[i], isused, arr)) return true;
                isused[i] = 0;//回退
            }
        }
        return false;
    }
}
