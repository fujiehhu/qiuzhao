package LC;

import utils.utils;

public class 旋转矩阵 {
    /*
     *给你一幅由 N × N 矩阵表示的图像，其中每个像素的大小为 4 字节。请你设计一种算法，将图像旋转 90 度。
     *不占用额外内存空间能否做到？
     *
     * 给定 matrix =
     *[
     * [1,2,3],   3 2 1    7 4 1
     * [4,5,6],   6 5 4    8 5 2
     * [7,8,9]    9 8 7    9 6 3
     *],
     *原地旋转输入矩阵，使其变为:
     *[
     *  [7,4,1],
     * [8,5,2],
     * [9,6,3]
     *]
     */
    public static void main(String[] args) {
        //1、左右镜像
        //2、对角镜像
        int arr[][] = utils.getArr3();
//        utils.printarr(arr);
        rotate(arr);
    }

    public static void rotate(int[][] matrix) {
        //1、左右镜像
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix[0].length - 1 - j];
                matrix[i][matrix[0].length - 1 - j] = temp;
            }
        }
        //2、对角镜像
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length - i - 1; j++) {
                int temp = matrix[i][j];//0 ,1   1 ,2
                matrix[i][j] = matrix[matrix.length - j - 1][matrix[0].length - 1 - i];
                matrix[matrix.length - j - 1][matrix[0].length - 1 - i] = temp;
            }
        }
        utils.printarr(matrix);
    }
}
