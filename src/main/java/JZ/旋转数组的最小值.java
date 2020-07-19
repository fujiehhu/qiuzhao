package JZ;

/**
 * Created by lenovo on 20/7/19.
 */
public class 旋转数组的最小值 {
    //    把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
    //    输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
    //    例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
    //    NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
    public static void main(String[] args) {
        int arr[] = {3, 4, 5, 1, 2};
        System.out.println(minNumberInRotateArray(arr));
    }

    public static int minNumberInRotateArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i + 1 < array.length && array[i + 1] < array[i]) {
                return array[i + 1];
            }
        }
        return 0;
    }
}
