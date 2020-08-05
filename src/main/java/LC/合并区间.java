package LC;

import java.util.ArrayList;
import java.util.List;

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

    //     1 2 3
//               4 5 6
//                     8 9 10
//                              15 16 17 18
//
//       2 3 4 5 6   9 10  15 16 17 18
    public static void main(String[] args) {
        int arr[][] = {{1, 4}, {5, 6} };
        merge(arr);
    }

    public static int[][] merge(int[][] intervals) {
        if (intervals.length == 0) return intervals;
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < intervals.length; ++i) {
            int begin = intervals[i][0];
            int end = intervals[i][intervals[i].length - 1];
            while (begin <= end) {
                if (!list.contains(begin)) {
                    list.add(begin++);
                } else {
                    begin++;
                }
            }
        }
        utils.utils.printList(list);
        List<int[]> res = new ArrayList<>();
        List<Integer> tmparr = new ArrayList<>();
        for (int cur = list.get(0); cur <= list.get(list.size() - 1) + 1; cur++) {
            if (list.contains(cur)) {
                tmparr.add(cur);
            } else {
                if (tmparr.size() != 0) {
                    int tmp[] = {tmparr.get(0), tmparr.get(tmparr.size() - 1)};
                    res.add(tmp);
                    tmparr.clear();
                }
            }
        }
        int resarr[][] = new int[res.size()][];
        for (int i = 0; i < res.size(); ++i) {
            resarr[i] = res.get(i);
            resarr[i] = res.get(i);
        }
        utils.utils.printarr(resarr);
        return resarr;
    }
}
