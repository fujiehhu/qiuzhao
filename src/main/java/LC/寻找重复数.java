package LC;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Created by fujie on 20/8/8.
 */
public class 寻找重复数 {
    //    给定一个包含 n + 1 个整数的数组 nums，
//    其数字都在 1 到 n 之间（包括 1 和 n），
//    可知至少存在一个重复的整数。假设只有一个重复的整数，找出这个重复的数。
    public static void main(String[] args) {
        int arr[] = {1, 5, 2, 5, 4, 3};
        System.out.println(findDuplicate(arr));
        // 1 3 4 2 2
        // 0 2 3 1 1     1 5 2 5 3 4
        //               0 1 1 0 0 1
    }

    public static int findDuplicate(int[] nums) {
        List<Integer> list = new ArrayList<>();
        //1\
//        for (int num : nums) {
//            if(!list.contains(num)){
//                list.add(num);
//            }else {
//                return num;
//            }
//        }

        //2
//        int rec[] = new int[nums.length];
//        for (int i = 0; i < nums.length; ++i) {
//            rec[nums[i]]++;
//            if (rec[nums[i]] == 2) {
//                return nums[i];
//            }
//        }
        //3、保存当前值
//        int tmp = nums[0];
        int res;
//        for (int i = 0; i < nums.length; ) {
//            res = tmp;
//            if (i == 0) {
//                tmp = nums[nums[i]];
//                nums[nums[i]] = nums[i] == -1 ? nums[i]++ : -1;
//            } else {
//                tmp = nums[i];
//                nums[i] = nums[i] == -1 ? nums[i] + 1 : -1;
//            }
//            if (nums[i] == 0) {
//                return res;
//            }
//            i = tmp;
//        }
        int tmp = 0;
        int i = nums[0];
        while (i < nums.length) {
            res = tmp;//保存要返回的值
            tmp = nums[i];//保存要修改的值的下标
            nums[i] = nums[i] == -1 ? 0 : -1;//修改
            if (nums[i] == 0) {
                return res;
            }
            i = tmp;
        }
        return 0;
    }

}
