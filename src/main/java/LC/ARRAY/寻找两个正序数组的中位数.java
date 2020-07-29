package LC.ARRAY;

import utils.utils;

public class 寻找两个正序数组的中位数 {
    /*
     * 给定两个大小为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。
     *请你找出这两个正序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
     *你可以假设 nums1 和 nums2 不会同时为空。
     *
     *示例 1:
     *nums1 = [1, 3]
     *nums2 = [2]
     *则中位数是 2.0
     */
//    先归并，在求中位数
    public static void main(String[] args) {

        int arr[] = {1, 2, 8};
        int arr1[] = {3, 4, 6};
        System.out.println(findMedianSortedArrays(arr, arr1));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int k = 0;
        double arr[] = new double[nums1.length + nums2.length];
        while (i <= nums1.length - 1 && j <= nums2.length - 1) {
            if (nums1[i] <= nums2[j]) {
                arr[k] = nums1[i];
                i++;
                k++;
            } else if (nums1[i] > nums2[j]) {
                arr[k] = nums2[j];
                j++;
                k++;
            }
        }
        if (i == nums1.length) {
            for (; j < nums2.length; j++) {
                arr[k] = nums2[j];
                k++;
            }
        } else if (j == nums2.length) {
            for (; i < nums1.length; i++) {
                arr[k] = nums1[i];
                k++;
            }
        }
        utils.printarr(arr);
        if (arr.length % 2 == 0) {
            return (arr[arr.length / 2] + arr[arr.length / 2 - 1]) / 2;
        } else {
            return arr[arr.length / 2];
        }
//        return 9999;
    }
}
