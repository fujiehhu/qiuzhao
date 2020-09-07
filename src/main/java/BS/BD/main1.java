package BS.BD;

import java.util.*;

/**
 * Created by lenovo on 20/9/3.
 */
public class main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        String[] nmk = tmp.split(" ");
        int n = Integer.valueOf(nmk[0]);
        int m = Integer.valueOf(nmk[1]);
        int k = Integer.valueOf(nmk[2]);
        ArrayList<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> goods = new ArrayList<>();
            String s = scanner.nextLine();
            String[] split = s.split(" ");
            goods.add(Integer.valueOf(split[0]));
            goods.add(Integer.valueOf(split[1]));
            goods.add(Integer.valueOf(split[2]));
            lists.add(goods);
        }
        Collections.sort(lists, new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                if (o1.get(2) != o2.get(2)) {
                    return o2.get(2) - o1.get(2);
                } else if (o1.get(1) != o2.get(1)) {
                    return o1.get(1) - o2.get(1);
                } else {
                    return o1.get(0) - o2.get(0);
                }
            }
        });
        int i = 0;
        int kk = 0, mm = 0;
        System.out.println(lists);
        while (true) {
            kk += lists.get(i).get(0);
            mm += lists.get(i).get(1);
            if (kk <= k && mm <= m) {
                if (i == lists.size() - 1) {
                    System.out.println(i + 1);
                    break;
                }
                i++;
            } else {
                System.out.println(i);
                break;
            }
        }

//        System.out.println(lists);
    }
}
