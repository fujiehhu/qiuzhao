package LC.ARRAY;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * Created by lenovo on 20/8/8.
 */
public class 三数之和 {
    //    给定数组 nums = [-1, 0, 1, 2, -1, -4]，
//
//    满足要求的三元组集合为：
//            [
//            [-1, 0, 1],
//            [-1, -1, 2]
//            ]
    //转换为二数之和
    public static void main(String[] args) {
        int arr[] = {-1, 0, 1, 2, -1, -4};
        threeSum(arr);
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        if (nums.length < 3) return null;
        List<List<Integer>> res = new ArrayList<>();
        HashMap<Integer, Integer> hashMap = new HashMap();
        for (int i = 0; i < nums.length; ++i) {
            hashMap.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; ++i) {
            for (int j = i + 1; j < nums.length; ++j) {

                if (hashMap.containsKey(-nums[i] - nums[j])) {
                    List<Integer> tmpres = new ArrayList<>();
                    tmpres.add(nums[i]);
                    tmpres.add(nums[j]);
                    tmpres.add(nums[hashMap.get(-nums[i] - nums[j])]);
                    Collections.sort(tmpres);
                    if (!res.contains(tmpres) && j != hashMap.get(-nums[i] - nums[j]) && i != hashMap.get(-nums[i] - nums[j]))
                        res.add(tmpres);
                }

            }
        }


        return res;
    }
}
