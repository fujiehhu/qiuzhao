package LC;

import java.util.Arrays;

/**
 * Created by fujie on 20/8/5.
 */
public class 合并区间 {
//    给出一个区间的集合，请合并所有重叠的区间。
//
//    示例 1:
//    输入: [[1,3],[2,6],[8,10],[15,18]]
//    输出: [[1,6],[8,10],[15,18]]
//    解释: 区间 [1,3] 和 [2,6] 重叠, 将它们合并为 [1,6].

    //     1 2 3 4
//                 5 6
//                     8 9 10
//                              15 16 17 18
//
//       2 3 4 5 6   9 10  15 16 17 18
    public static void main(String[] args) {
        int arr[][] = {{1, 1}, {1, 4}, {5, 8}, {6, 8}, {7, 9}, {15, 18}};
        //int arr[][] = {{1, 1}, {1, 4}, {5, 8}, {6, 10}};
        merge(arr);
    }

    public static int[][] merge(int[][] intervals) {
        // 先按照区间起始位置排序
        Arrays.sort(intervals, (v1, v2) -> v1[0] - v2[0]);
        // 遍历区间
        int[][] res = new int[intervals.length][2];
        int idx =0;
        for (int[] interval : intervals) {
            // 如果结果数组是空的，或者当前区间的起始位置 > 结果数组中最后区间的终止位置，
            // 则不合并，直接将当前区间加入结果数组。
            if (idx ==0 || interval[0] > res[idx-1][1]) {
                res[idx++] = interval;
            } else {
                // 反之将当前区间合并至结果数组的最后区间
                res[idx-1][1] = Math.max(res[idx-1][1], interval[1]);
            }
        }
        return Arrays.copyOf(res, idx);
    }
}
