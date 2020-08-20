package HJ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by fujie on 20/8/20.
 */
public class 最后一个单词的长度 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();
        System.out.println(strlen(string));
    }

    public static int strlen(String string) {
        string = string.trim();
        //String[] split = string.split(" ");
        String s = new String();



        if(string.length()==0){
            return 0;
        }
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            list.add(string.charAt(i));
        }
        Collections.reverse(list);
        int count = 0;
        for (int i = 0; i < list.size(); ++i) {
            if (list.get(i) != ' ') {
                count++;
            } else {
                break;
            }
        }
        return count;
    }
}
