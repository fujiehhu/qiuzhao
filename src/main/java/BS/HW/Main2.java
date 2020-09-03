package BS.HW;

import javax.swing.text.html.CSS;
import java.util.*;

/**
 * Created by lenovo on 20/9/2.
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        ArrayList<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String s = scanner.nextLine();
            String[] split = s.split(" ");
            ArrayList<Integer> integers = new ArrayList<>();
            integers.add(Integer.valueOf(split[1]));
            integers.add(Integer.valueOf(split[0]));
            integers.add(i + 1);
            lists.add(integers);
        }
        Collections.sort(lists, new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                if (o1.get(0) != o2.get(0))
                    return o1.get(0) - o2.get(0);
                else
                    return o2.get(1) - o1.get(1);
            }
        });

        int cnt1 = 0;
        int cnt2 = 0;
        int n1 = 0;
        int n2 = 0;
        for (int i = 0; i < lists.size(); i++) {
            List<Integer> list = lists.get(i);
            if (list.get(0) == 1) {
                cnt1 += list.get(1);
                n1++;
                if (n1 == 3) {
                    break;
                }
            }
            if (list.get(0) == 2) {
                cnt2 += list.get(1);
                n2++;
                if (n2 == 3) {
                    break;
                }
            }

        }
        if (n1 < 3 && n2 < 3) {
            System.out.println("null");
        } else {
            int max = cnt1 > cnt2 ? cnt1 : cnt2;
            if (max == cnt1) {
                for (int i = 0; i < 3; i++) {
                    System.out.print(lists.get(i).get(2) + " ");
                }
                System.out.println();
                System.out.print(lists.get(0).get(0) + " ");
                System.out.println(max);
            } else {
                int cnt = 0;
                int j = 0;
                ArrayList<Integer> arrayList = new ArrayList<>();
                for (int i = 0; i < lists.size(); i++) {
                    if (lists.get(i).get(0) == 2 && cnt < 3) {
                        arrayList.add(lists.get(i).get(2));
                        cnt++;
                        j = i;
                    }
                }
                Collections.sort(arrayList);
                for (int i = 0; i < arrayList.size(); i++) {
                    Integer integer =  arrayList.get(i);
                    System.out.print(integer+" ");
                }
                System.out.println();
                System.out.println(lists.get(j).get(0) + " ");
                System.out.println(max);
            }
        }
    }
}
