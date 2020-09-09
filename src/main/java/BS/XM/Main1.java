package BS.XM;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by lenovo on 20/9/8.
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] split = str.split(" ");
        for (int i = 0; i < split.length; i++) {
            String pwd = split[i];
            if (pwd.trim().length() == 0) {
                continue;
            }
            if (pwd.length() < 8 || pwd.length() > 120) {
                System.out.println(1);
                continue;
            }
            int flag[] = new int[4];
            for (int j = 0; j < pwd.length(); j++) {
                if (pwd.charAt(j) >= 'a' && pwd.charAt(j) <= 'z') {
                    flag[0] = 1;
                } else if (pwd.charAt(j) >= 'A' && pwd.charAt(j) <= 'Z') {
                    flag[1] = 1;
                } else if (pwd.charAt(j) >= '0' && pwd.charAt(j) <= '9') {
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
            if (res) {
                System.out.println(0);
            } else {
                System.out.println(2);
            }

        }

    }
}
