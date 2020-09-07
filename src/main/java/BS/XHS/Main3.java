package BS.XHS;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by lenovo on 20/9/6.
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = Integer.valueOf(sc.nextLine());
        String ltn = sc.nextLine();
        String[] split = ltn.split(" ");
        int l = Integer.valueOf(split[0]);
        int t = Integer.valueOf(split[1]);
        int n = Integer.valueOf(split[2]);
        String nums = sc.nextLine();
        String[] num = nums.split(" ");
        int arr[] = new int[num.length];
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < num.length; i++) {
            arr[i] = Integer.valueOf(num[i]);
            set.add(Integer.valueOf(num[i]));
        }
        Arrays.sort(arr);
        int cur = 0;
        int cnt = 0;
        while (cur < x) {
            for (int i = l; i <= t; i++) {
                if (isin(cur + i, set, arr)) {
                    cur += l;
                    break;
                } else {
                    cur += t;
                    cnt++;
                    break;
                }
            }

        }
        System.out.println(cnt);


    }

    public static boolean isin(int now, Set set, int arr[]) {
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == now) {
                cnt++;
            }


        }
        return cnt == 0;
    }

}
