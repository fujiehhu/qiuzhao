package JZ;

/**
 * Created by fujie on 20/8/20.
 */
public class 二维数组顺时针遍历 {
    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {1, 2, 3},
        };
        printarr(arr);
    }

    public static void printarr(int arr[][]) {
        int row = arr.length;
        int col = arr[0].length;

        int x0 = 0, y0 = 0, x1 = col - 1, y1 = row - 1;
        //左上和右下坐标

        while (true) {
            int a = x0, b = y0;
            //上
            for (; a < x1; ) {
                System.out.print(arr[b][a++] + " ");
            }
            //右
            for (; b < y1; ) {
                System.out.print(arr[b++][a] + " ");
            }
            //下
            if (y0 < y1)
                for (; a > x0; ) {
                    System.out.print(arr[b][a--] + " ");
                }
            //左
            for (; b > y0; ) {
                System.out.print(arr[b--][a] + " ");
            }
            x1--;
            y1--;
            x0++;
            y0++;
            if (x0 == x1) {
                break;
            }
        }
    }
}
