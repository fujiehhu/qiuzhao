package BS.BDY;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by lenovo on 20/9/14.
 */
public class main2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nm = sc.nextLine();
        int n = Integer.valueOf(nm.split(" ")[0]);
        int m = Integer.valueOf(nm.split(" ")[1]);
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(0);
            list.add(i + 1);
            lists.add(list);
        }
        for (int i = 0; i < m; i++) {
            String od = sc.nextLine();
            String cq = od.split(" ")[0];
            int fir = Integer.valueOf(od.split(" ")[1]);
            int sec = Integer.valueOf(od.split(" ")[2]);
            ArrayList<Integer> tmp1 = new ArrayList<>();
            ArrayList<Integer> tmp2 = new ArrayList<>();
            tmp1 = lists.get(fir - 1);
            tmp2 = lists.get(sec - 1);
            // c 3 6
            if (cq.equals("C")) {
                int cnt = 1;
                while (tmp1.size() > 1) {
                    tmp2.add(tmp1.get(cnt));
                    tmp1.remove(cnt);

                }
            } else {
                int res = -1;
                for (int j = 0; j < lists.size(); j++) {
                    ArrayList<Integer> tmp = new ArrayList<>();
                    tmp = lists.get(j);
                    for (int k = 1; k < tmp.size(); k++) {
                        if (tmp.contains(fir) && tmp.contains(sec)) {
                            res = Math.abs(tmp.indexOf(fir) - tmp.indexOf(sec)) - 1;
                        } else {
                            break;
                        }
                    }

                }
                list1.add(res);
//                System.out.println(res);
            }
        }
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));

        }
    }
}
