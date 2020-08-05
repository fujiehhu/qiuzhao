package LC.ARRAY;

/**
 * Created by fujie on 20/8/1.
 */
public class 每日温度 {
    //    请根据每日 气温 列表，重新生成一个列表。
// 对应位置的输出为：要想观测到更高的气温，至少需要等待的天数。
// 如果气温在这之后都不会升高，请在该位置用 0 来代替。
//
//    例如，给定一个列表 temperatures = [73, 74, 75, 71, 69, 72, 76, 73]，
// 你的输出应该是 [1, 1, 4, 2, 1, 1, 0, 0]。
    public static int[] dailyTemperatures(int[] T) {
        if (T.length == 1) return new int[1];
        int res[] = new int[T.length];
        int i = 0;
        int j = 1;
        while (j < T.length) {
            int tmp = 1;
            while (T[j] <= T[i]) {
                if (j == T.length - 1) {
                    tmp = 0;
                    break;
                }
                tmp++;
                j++;

            }
            res[i] = tmp;
            i++;
            j = i + 1;

        }
        res[T.length - 1] = 0;
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {73, 73};
        utils.utils.printarr(dailyTemperatures(arr));
    }

}
