package BS.Bl;

/**
 * Created by lenovo on 20/9/4.
 */
public class Main2 {
    public static void main(String[] args) {
        int left = 0;
        int right = 0;
        int res = 0;
//        while (right!=)
    }

    public int GetMaxConsecutiveOnes(int[] arr, int k) {
        // write code here
        int left = 0;
        int right = 0;
        int max = 0;
        int res = 0;
        while (right != arr.length) {
            if (arr[right++] == 0) {
                res++;
            }
            while (res > k) {
                if (arr[left++] == 0) {
                    res--;
                }
            }
            int cnt = right - left;
            max = max > cnt ? max : cnt;
        }
        return max;
    }
}
