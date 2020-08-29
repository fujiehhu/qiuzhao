package BS.MT;

import java.util.Scanner;

/**
 * Created by fujie on 20/8/29.
 */
public class Main1 {
    public static void main(String[] args) {
        //MMATSATMMT
        Scanner scanner = new Scanner(System.in);
        //int n = scanner.nextInt();
        //scanner.nextLine();
        //String str = scanner.nextLine();
        int n = 10;
        String str = "MMATSATMMT";
        if (str.length() <= 4)
            return;
        int start = 0;
        int end = 0;
        int left = 0;
        int right = 0;
        for (int i = 0; i < str.length(); i++) {
            if (start == 1 && str.charAt(i) == 'T') {
                left = i;
                break;
            }
            if (str.charAt(i) == 'M') {
                start = 1;
            }
        }
        left++;
        for (int i = str.length()-1; i > 0; i--) {
            if (end == 1 && str.charAt(i) == 'M') {
                right = i;
                break;
            }
            if (str.charAt(i) == 'T') {
                end = 1;
            }

        }

        System.out.println(left);
        System.out.println(right);
        System.out.println(str.substring(left,right));
    }

}
