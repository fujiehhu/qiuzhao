package HJ;

import java.util.Scanner;

/**
 * Created by fujie on 20/8/24.
 */
public class 密码验证合格程序 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            //长度
            if (s.length() < 8) {
                System.out.println("NG");
                continue;
            }
            //字母数字特殊字符
            int flag[] = new int[4];
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                    flag[0] = 1;
                } else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                    flag[1] = 1;
                } else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                    flag[2] = 1;
                } else {
                    flag[3] = 1;
                }
            }
            int count = 0;
            for (int j : flag) {
                if (j == 1) {
                    count++;
                }
            }
            if (count < 3) {
                System.out.println("NG");
                continue;
            }
            //重复
            int loop = 0;
            for (int i = 0; i < s.length() - 3; i++) {
                String substring = s.substring(i, i + 3);
                if (s.substring(i + 3).contains(substring)) {
                    System.out.println("NG");
                    loop = 1;
                    break;
                }
            }
            if (loop == 1) {
                continue;
            }
            System.out.println("OK");
        }
    }

//    public void pro(String s) {
//
//        //长度
//        if (s.length() < 8) {
//            System.out.println("NG");
//            return;
//        }
//        //字母数字特殊字符
//        int flag[] = new int[4];
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
//                flag[0] = 1;
//            } else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
//                flag[1] = 1;
//            } else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
//                flag[2] = 1;
//            } else {
//                flag[3] = 1;
//            }
//        }
//        int count = 0;
//        for (int j : flag) {
//            if (j == 1) {
//                count++;
//            }
//        }
//        if (count < 3) {
//            System.out.println("NG");
//            return;
//        }
//        //重复
//        int loop = 0;
//        for (int i = 0; i < s.length() - 3; i++) {
//            String substring = s.substring(i, i + 3);
//            if (s.substring(i + 3).contains(substring)) {
//                System.out.println("NG");
//                loop = 1;
//                break;
//            }
//        }
//        if (loop == 1) {
//            return;
//        }
//        System.out.println("OK");
//    }
}
