package HJ;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by fujie on 20/8/25.
 */
public class 简单密码 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            StringBuilder stringBuilder = new StringBuilder();

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                    stringBuilder.append(s.charAt(i));
                }
                if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                    stringBuilder.append(pro(s.charAt(i)));
                }
                if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                    stringBuilder.append(proA(s.charAt(i)));
                }
            }
            System.out.println(stringBuilder.toString());
        }
    }

    public static String pro(Character c) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("abc", 2);
        hashMap.put("def", 3);
        hashMap.put("ghi", 4);
        hashMap.put("jkl", 5);
        hashMap.put("mno", 6);
        hashMap.put("pqrs", 7);
        hashMap.put("tuv", 8);
        hashMap.put("wxyz", 9);
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            if (entry.getKey().contains(c + "")) {
                return entry.getValue() + "";
            }
        }
        return "";
    }

    public static String proA(Character c) {
        char res;
        if (c == 'Z') {
            res = 'a';
        } else {
            res = (char) (c + 1);
        }

        String s = res + "";
        return  s.toLowerCase();
    }
}
