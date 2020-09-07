package BS.Bl;

import java.util.Scanner;

/**
 * Created by lenovo on 20/9/4.
 */
public class Main1 {
    public static void main(String[] args) {

        String str = "";
        System.out.println(GetFragment(str));

    }

    public static int GetFragment(String str) {
        // write code here
        if (str.length() == 0) {
            return 0;
        }
        char c = str.charAt(0);
        int cnt = 1, res;
        for (int i = 0; i < str.length(); i++) {
            if (c != str.charAt(i)) {
                c = str.charAt(i);
                cnt++;
            }
        }
        res = str.length() / cnt;
        return res;
    }
}
