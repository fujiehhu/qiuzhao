package LC.DP;

/**
 * Created by fujie on 20/8/4.
 */
public class 最大子序和 {
    public static void main(String[] args) {
        int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        //System.out.println(getSum(arr, 0, 2));
        maxSubArray(arr);
    }

    public static int maxSubArray(int[] nums) {
        if (nums == null) {
            return 0;
        }

        int max = nums[0];    // 全局最大值
        int subMax = nums[0];  // 前一个子组合的最大值
        for (int i = 1; i < nums.length; i++) {
            if (subMax > 0) {
                // 前一个子组合最大值大于0，正增益
                subMax = subMax + nums[i];
            } else {
                // 前一个子组合最大值小于0，抛弃前面的结果
                subMax = nums[i];
            }
            // 计算全局最大值
            max = Math.max(max, subMax);
        }


        System.out.println(max);
        System.out.println(subMax);
        return max;
    }

    public static int getSum(int[] arr, int i, int j) {
        int sum = 0;
        for (; i <= j; ) {
            sum += arr[i++];
        }
        return sum;
    }
}
