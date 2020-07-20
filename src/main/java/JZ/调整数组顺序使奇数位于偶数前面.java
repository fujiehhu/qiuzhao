package JZ;

import utils.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 20/7/19.
 */
public class 调整数组顺序使奇数位于偶数前面 {

    /*
     *    输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
     *    所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
     */
    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 8,1};
//        utils.printarr(arr);
        reOrderArray(arr);
    }

    public static void reOrderArray(int[] array) {
        if (array.length == 0) {
            return;
        }
        List<Integer> ou = new ArrayList<>();
        List<Integer> ji = new ArrayList<>();
        for (int k = 0; k < array.length; k++) {
            if (array[k] % 2 != 0) {
                ji.add(array[k]);
            } else {
                ou.add(array[k]);
            }
        }
        int res[] = new int[array.length];
        int i;
        for (i = 0; i < ji.size(); i++) {
            res[i] = ji.get(i);
        }
        for (int j = 0; j < ou.size(); j++) {
            res[i++] = ou.get(j);
        }
        utils.printarr(res);
    }
}
