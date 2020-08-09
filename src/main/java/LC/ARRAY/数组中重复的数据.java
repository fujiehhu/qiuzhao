package LC.ARRAY;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by fujie on 20/8/9.
 */
public class 数组中重复的数据 {
    //    给定一个整数数组 a，其中1 ≤ a[i] ≤ n （n为数组长度）, 其中有些元素出现两次而其他元素出现一次。
//
//    找到所有出现两次的元素。
//
//    你可以不用到任何额外空间并在O(n)时间复杂度内解决这个问题吗？
//    输入:
//            [4,3,2,7,8,2,3,1]
    //4, 3, 2, 7, 8, 2, 3, 1
    //    -6  -7  -2        -6
//3 2
//    输出:
//            [2,3]
    public static void main(String[] args) {
        int arr[] = {4, 3, 8, 7, 8, 6, 3, 1};
        findDuplicates(arr);
    }

    public static List<Integer> findDuplicates(int[] nums) {
        //1.
        List<Integer> list = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
//        for (int num : nums) {
//            if (!list.contains(num)) {
//                list.add(num);
//            } else {
//                res.add(num);
//            }
//        }
        //2把数组当作hashmap，value第一次置为负，如果访问时为负，说明存在相同的key
        int n = nums.length + 1;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[Math.abs(nums[i]) - 1] < 0) {
                res.add(Math.abs(nums[i]));

            }
            nums[Math.abs(nums[i]) - 1] = -nums[Math.abs(nums[i]) - 1];
        }

        Collections.sort(res);
        utils.utils.printList(res);
        return res;

    }
}

