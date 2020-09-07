package BS.BD;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by lenovo on 20/9/3.
 */
public class main2 {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        Collections.sort(integers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println(integers);
    }
}
