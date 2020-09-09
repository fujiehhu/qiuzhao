package HJ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Created by fujie on 20/9/7.
 */
public class 字符串排序 {
    public static void main(String[] args) {
//        String s = "A Famous Saying: Much Ado About Nothing (2012/8).";
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            ArrayList<String> fuhao = new ArrayList<>();
            ArrayList<String> zimu = new ArrayList<>();
            for (int i = 0; i < s.length(); i++) {
                if (Pattern.matches("[a-zA-Z]", s.charAt(i) + "")) {
                    zimu.add(s.charAt(i) + "");
                } else if(s.charAt(i) != ' '){
                    fuhao.add(s.charAt(i) + "");
                }
            }
            Collections.sort(zimu, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return o1.toLowerCase().compareTo(o2.toLowerCase());
                }
            });
            int z = 0;
            int f = 0;
            for (int i = 0; i < s.length(); i++) {
                if (Pattern.matches("[a-zA-Z]", s.charAt(i) + "")) {
                    System.out.print(zimu.get(z++));
                } else if (s.charAt(i) == ' ') {
                    System.out.print(" ");
                } else {
                    System.out.print(fuhao.get(f++));
                }
            }
            System.out.println();
        }
    }
}
