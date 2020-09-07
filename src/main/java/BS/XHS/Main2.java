package BS.XHS;

/**
 * Created by lenovo on 20/9/6.
 */
public class Main2 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(subSort(arr));

    }

    static int[] subSort(int[] arr) {
        int res[] = new int[2];
        if (arr.length == 0 || arr == null) {
            res[0] = -1;
            res[1] = -1;
            return res;
        }

        int st = -1, ed = -1;
        int min = arr[arr.length - 1];
        int max = arr[0];


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            } else {
                ed = i;
            }
            if (arr[arr.length - 1 - i] <= min) {
                min = arr[arr.length - 1 - i];
            } else {
                st = arr.length - 1 - i;
            }
            if (i > (arr.length - 1 - i)) {
                break;
            }
        }
        res[0] = st;
        res[1] = ed;
        return res;

    }
}
