package LC.XOR;

import utils.utils;

/**
 * Created by lenovo on 20/7/26.
 */
public class 只出现一次的数字 {
    //    给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
    public static void main(String[] args) {
//        数组中的全部元素的异或运算结果即为数组中只出现一次的数字。
        int a[] = {2, 2, 1};
        System.out.println(singleNumber(a));
    }

    public static int singleNumber(int[] nums) {
        int single = 0;
        for (int num : nums) {
            single ^= num;
        }
        return single;
    }
}
