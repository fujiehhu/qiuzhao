package LC;

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
    public static void main(String[] args) {

        int arr[] = {1, 2};
        int arr1[] = {3,4};
        System.out.println(findMedianSortedArrays(arr1,arr));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int temp = 0;
        int temp1 = 0;

        if (nums1.length % 2 == 0) {
            temp = (nums1[nums1.length / 2] + nums1[nums1.length / 2 - 1]) / 2;
        } else {
            temp = nums1[nums1.length / 2];
        }
        if (nums2.length % 2 == 0) {
            temp1 = (nums2[nums2.length / 2] + nums2[nums2.length / 2 - 1]) / 2;
        } else {
            temp1 = nums2[nums2.length / 2];
        }
        return (temp + temp1) / 2;
    }
}
