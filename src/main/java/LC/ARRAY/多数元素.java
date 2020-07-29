package LC.ARRAY;

import java.util.Arrays;

/**
 * Created by fujie on 20/7/26.
 */
public class 多数元素 {

    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums.length > 1 ? nums[nums.length / 2] : nums[0];
    }
}
