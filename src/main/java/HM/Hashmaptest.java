package HM;

import java.util.*;
import java.util.Map.Entry;

/**
 * Created by fujie on 20/7/27.
 */
public class Hashmaptest {
    public static void main(String[] args) {
        HashMap<Integer, User> users = new HashMap<>();
        users.put(1, new User("王二", 22));
        users.put(2, new User("李四", 24));
        users.put(3, new User("张三", 23));
        System.out.println(users);
//	sorthashmap(users);
        HashMap<Integer, User> users1 = sorthashmap(users);
        System.out.println(users1);
    }

    public static HashMap<Integer, User> sorthashmap(HashMap<Integer, User> map) {

        Set<Entry<Integer, User>> entries = map.entrySet();

        List<Entry<Integer, User>> list = new ArrayList<Entry<Integer, User>>(entries);
        Collections.sort(list, new Comparator<Entry<Integer, User>>() {

            @Override
            public int compare(Entry<Integer, User> o1, Entry<Integer, User> o2) {
                return o2.getValue().getAge() - o1.getValue().getAge();
            }
        });
        LinkedHashMap<Integer, User> linkedHashMap = new LinkedHashMap<Integer, User>();

        for (Entry<Integer, User> entry : list) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        return linkedHashMap;

    }
}
