package BS.FR;

import java.util.*;

/**
 * Created by lenovo on 20/8/28.
 */
//3 3 4 3
//        1:5 3:8 5:1
//        1:2 2:2 4:3  5:2
//        2:3 4:4 6:3
//    11:123 23:21312
//            11:131 23:231 123:13412
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String nn = scanner.nextLine();
            int n = nn.charAt(0) - '0';
            int nums[] = new int[n];//个数 3
            HashMap<Integer, Integer> hashMap = new HashMap<>();
            StringBuilder stringBuilder = new StringBuilder();
//        for (int i = 0; i < n; i++) {
//            nums[i] = scanner.nextInt();//3 4 3
//        }
            for (int i = 0; i < n; i++) {
                String tmp = scanner.nextLine();//1 :1 2:2  1 1 2 2
                stringBuilder.append(tmp + " ");
            }
            String[] split = stringBuilder.toString().split(" ");
            for (int i = 0; i < split.length; i++) {
                if (split[i].trim().length() == 0) {
                    continue;
                }
                String[] strings = split[i].split(":");
                hashMap.put(Integer.parseInt(strings[0].trim()), hashMap.getOrDefault(Integer.parseInt(strings[0].trim()), 0) + Integer.parseInt(strings[1].trim()));
            }
            List<List<Integer>> res = new ArrayList<>();

            for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
                ArrayList<Integer> integers = new ArrayList<>();
                integers.add(entry.getKey());
                integers.add(entry.getValue());
                res.add(integers);
            }

            Collections.sort(res, new Comparator<List<Integer>>() {
                @Override
                public int compare(List<Integer> o1, List<Integer> o2) {
                    return o1.get(0) - o2.get(0);
                }
            });
            StringBuilder res1 = new StringBuilder();
            for (int i = 0; i < res.size(); i++) {
                List<Integer> integers = res.get(i);
//            System.out.print(integers.get(0) + ":" + integers.get(1) + " ");
                res1.append(integers.get(0) + ":" + integers.get(1) + " ");
            }
            System.out.println(res1.toString().trim());
        }
    }
}

