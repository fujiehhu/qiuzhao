package HJ;


import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by fujie on 20/8/24.
 */
public class 简单错误记录 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, Integer> hashMap = new LinkedHashMap<>();


        while (scanner.hasNextLine()) {

            String s1 = scanner.nextLine();
            String[] strings = s1.split(" ");
            String path = strings[0];
            String line = strings[1];
            String[] split = path.split("\\\\");
            String filename = split[split.length - 1];
            if (filename.length() > 16) {//16
                filename = filename.substring(filename.length() - 16);
            }
            if (!hashMap.containsKey(filename + " " + line)) {
                hashMap.put(filename + " " + line, 1);
            } else {
                hashMap.put(filename + " " + line, hashMap.get(filename + " " + line) + 1);
            }
            hashMap.put(filename + " " + line,hashMap.getOrDefault(filename + " " + line,0)+1);
            int count = 0;
            for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
                count++;
                if (count > (hashMap.size() - 8))
                    System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }

    }
}
