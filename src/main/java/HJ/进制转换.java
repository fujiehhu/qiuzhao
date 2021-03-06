package HJ;

import java.util.Scanner;

/**
 * Created by fujie on 20/8/21.
 */
public class 进制转换 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {//多组同时输入，死循环
            String s = scanner.nextLine();
            s = s.substring(2);
            int res = 0;
            for (int i = s.length() - 1; i >= 0; i--) {
                res += Math.pow(16, i) * pro(s.charAt(s.length() - 1 - i));
            }
            System.out.println(String.valueOf(res));
        }
    }

    public static int pro(char c) {
        int a = 0;
        switch (c) {
            case 'A':
                a = 10;
                break;
            case 'B':
                a = 11;
                break;
            case 'C':
                a = 12;
                break;
            case 'D':
                a = 13;
                break;
            case 'E':
                a = 14;
                break;
            case 'F':
                a = 15;
                break;
            default:
                a = c - '0';
        }
        return a;
    }
}

