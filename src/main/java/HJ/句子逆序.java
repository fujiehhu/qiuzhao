package HJ;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by fujie on 20/8/22.
 */
public class 句子逆序 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        String s = scanner.nextLine();
        String s = "I am a boy";
        System.out.println(reverse(s));
    }

    public static String reverse(String sentence) {
        String[] split = sentence.split(" ");
        List<String> list = Arrays.asList(split);
        Collections.reverse(list);
        StringBuilder s = new StringBuilder();
        for (String ss : list) {
            s.append(ss + " ");
        }
        return s.toString().trim();
    }
}
