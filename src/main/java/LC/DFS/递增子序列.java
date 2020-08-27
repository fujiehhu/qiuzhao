package LC.DFS;

import java.util.*;

/**
 * Created by fujie on 20/8/26.
 */
public class 递增子序列 {
    static List<List<Integer>> res = new ArrayList<>();

    public static void main(String[] args) {
        int arr[] = {4, 6, 7, 7};
        findSubsequences(arr);
    }

    public static List<List<Integer>> findSubsequences(int[] nums) {
        List<Integer> list = new ArrayList<>();
        DFS(nums, new int[nums.length], list, 0);

        System.out.println(res);
        return res;

    }

    public static void DFS(int[] nums, int flag[], List<Integer> path, int k) {
        if (path.size() > 1) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = k; i < nums.length; i++) {
            if (flag[i] == 1)
                continue;
            path.add(nums[i]);
            flag[i] = 1;
            DFS(nums, flag, path, i);
            flag[i] = 0;
            path.remove(path.size() - 1);//回退到上一个节点
        }

    }
}
