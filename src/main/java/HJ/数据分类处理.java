package HJ;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by fujie on 20/9/7.
 */
public class 数据分类处理 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String i[] = scanner.nextLine().split(" ");
        String r[] = scanner.nextLine().split(" ");
        int ii[] = new int[i.length - 1];
        int rr[] = new int[r.length - 1];

        for (int j = 0; j < ii.length; j++) {
            ii[j] = Integer.valueOf(i[j + 1]);
        }
        for (int j = 0; j < rr.length; j++) {
            rr[j] = Integer.valueOf(r[j + 1]);
        }
        Arrays.sort(rr);
        ArrayList<Object> lists = new ArrayList<>();
        for (int j = 0; j < rr.length; j++) {
            if (j > 0 && rr[j] == rr[j - 1]) {
                continue;
            }
            String tmp = rr[j] + "";
            ArrayList<String> list = new ArrayList<>();
            for (int k = 0; k < ii.length; k++) {

                String tar = ii[k] + "";
                for (int l = 0; l < tar.length(); l++) {
                    if (tar.substring(l).contains(tmp) && !list.contains(k + "")) {
                        list.add(k + "");
                        list.add(ii[k] + "");
                    }
                }
            }
            lists.add(rr[j]);
            lists.add(list);
        }
        ArrayList<Integer> res = new ArrayList<>();
        for (int j = 0; j < lists.size(); j += 2) {
            Integer inte = (Integer) lists.get(j);
            ArrayList<String> o = (ArrayList<String>) lists.get(j + 1);
            if (o.size() != 0) {
                res.add(inte);
                res.add(o.size() / 2);
                for (int k = 0; k < o.size(); k++) {
                    res.add(Integer.valueOf(o.get(k)));
                }
            }
        }
        System.out.print(res.size() + " ");
        for (int j = 0; j < res.size(); j++) {
            Integer integer = res.get(j);
            System.out.print(integer + " ");
        }
        System.out.println();
    }
}
