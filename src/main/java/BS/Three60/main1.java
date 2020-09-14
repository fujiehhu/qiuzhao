package BS.Three60;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Scanner;

/**
 * Created by lenovo on 20/9/11.
 */
public class main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            int flag[] = new int[4];
            for (int i = 0; i < s.length(); i++) {
                if (s.length() < 8) {
                    break;
                }
                if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                    flag[0] = 1;
                } else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                    flag[1] = 1;
                } else if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                    flag[2] = 1;
                } else {
                    flag[3] = 1;
                }
            }
            boolean res = true;
            for (int k = 0; k < flag.length; k++) {
                if (flag[k] != 1) {
                    res = false;
                    break;
                }
            }
            if (res) System.out.println("Ok");
            else System.out.println("Irregular password");
        }
    }
}
