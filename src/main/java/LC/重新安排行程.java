package LC;

import java.util.*;

/**
 * Created by lenovo on 20/8/27.
 */
public class 重新安排行程 {
    public static void main(String[] args) {
        List<List<String>> lists = new ArrayList<>();
        ArrayList<String> objects1 = new ArrayList<>();
        ArrayList<String> objects2 = new ArrayList<>();
        ArrayList<String> objects3 = new ArrayList<>();
        ArrayList<String> objects4 = new ArrayList<>();
        ArrayList<String> objects5 = new ArrayList<>();
        objects1.add("JFK");
        objects1.add("SFO");
        objects2.add("JFK");
        objects2.add("ATL");
        objects3.add("SFO");
        objects3.add("ATL");
        objects4.add("ATL");
        objects4.add("JFK");
        objects5.add("ATL");
        objects5.add("SFO");
        lists.add(objects1);
        lists.add(objects2);
        lists.add(objects3);
        lists.add(objects4);
        lists.add(objects5);
        System.out.println(lists);
        findItinerary(lists);


    }

    public static List<String> findItinerary(List<List<String>> tickets) {
        List<List<String>> JFK = new ArrayList<>();
        List<List<String>> oth = new ArrayList<>();
        List<String> res = new ArrayList<>();
        HashMap<String, String> hashMap = new HashMap<>();
        for (int i = 0; i < tickets.size(); i++) {
            if (tickets.get(i).get(0) == "JFK") {
                JFK.add(tickets.get(i));
            } else {
                oth.add(tickets.get(i));
//                hashMap.put(tickets.get(i).get(0), tickets.get(i).get(1));
            }
        }
        Collections.sort(JFK, new Comparator<List<String>>() {
            @Override
            public int compare(List<String> o1, List<String> o2) {
                return o1.get(1).compareTo(o2.get(1));
            }
        });
        Collections.sort(oth, new Comparator<List<String>>() {
            @Override
            public int compare(List<String> o1, List<String> o2) {

                return o1.get(0).compareTo(o2.get(0));
            }
        });
        System.out.println(JFK);
        System.out.println(oth);
        for (int i = 0; oth.size() == 0; i++) {
            List<String> strings = JFK.get(i);
            res.add(strings.get(0));
            res.add(strings.get(1));
            res.add(oth.get(0).get(1));
            oth.remove(0);
//            res.add(hashMap.get(strings.get(1)));
        }
        return null;
    }

}
