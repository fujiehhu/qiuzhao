package LC.ARRAY;

import java.util.HashMap;

/**
 * Created by fujie on 20/8/8.
 */
public class 两数之和 {
//    给定 nums = [2, 7, 11, 15], target = 9
//
//    因为 nums[0] + nums[1] = 2 + 7 = 9
//    所以返回 [0, 1]


    public static void main(String[] args) {
        int arr[] = {2, 17, 9, 15};
        twoSum(arr, 9);
    }

    public static int[] twoSum(int[] nums, int target) {
        if (nums.length < 2) return null;
        HashMap<Integer, Integer> hashMap = new HashMap();
        int res[] = new int[2];
        for (int i = 0; i < nums.length; ++i) {
            if (hashMap.containsKey(target - nums[i])) {
                res[0] = i < hashMap.get(target - nums[i]) ? i : hashMap.get(target - nums[i]);
                res[1] = i > hashMap.get(target - nums[i]) ? i : hashMap.get(target - nums[i]);
                break;
            }
            hashMap.put(nums[i], i);
        }
        utils.utils.printarr(res);
        return res;
    }
}
