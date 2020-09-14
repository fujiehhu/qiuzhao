package BS;

import java.util.*;

/**
 * Created by lenovo on 20/9/13.
 */
public class test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.valueOf(scanner.nextLine());
        ArrayList<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String s = scanner.nextLine();
            ArrayList<Integer> integers = new ArrayList<>();
            integers.add(Integer.valueOf(s.split(" ")[0]));
            integers.add(Integer.valueOf(s.split(" ")[1]));
            integers.add(i + 1);
            lists.add(integers);
        }
        Collections.sort(lists, new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                if (o1.get(1) != o2.get(1)) {
                    return o2.get(1) - o1.get(1);
                } else if (o1.get(0) != o2.get(0)) {
                    return o2.get(0) - o1.get(0);
                } else {
                    return o1.get(2) - o2.get(2);
                }
            }
        });
        for (int i = 0; i < lists.size(); i++) {
            List<Integer> list = lists.get(i);
            System.out.print(list.get(2) + " ");
        }
    }
}
