package utils;

import JZ.ListNode;

import java.util.List;

/**
 * Created by lenovo on 20/7/19.
 */
public class utils {

    //返回一个链表 {1，2，3，4，5}
    public static ListNode getList() {
        ListNode head = new ListNode(1);
        ListNode p2 = new ListNode(2);
        ListNode p3 = new ListNode(3);
        ListNode p4 = new ListNode(4);
        ListNode p5 = new ListNode(5);

        head.next = p2;
        p2.next = p3;
        p3.next = p4;
        p4.next = p5;
        return head;
    }

    //返回一个一维数组[1,2,3,4,5]
    public static int[] getArr1() {
        int arr[] = {1, 2, 3, 4, 5};
        return arr;
    }

    //返回一个二维数组
    public static int[][] getArr2() {
        int arr[][] = {{1, 2, 3, 4, 5}, {2, 3, 4, 5, 6}};
        return arr;
    }

    //返回一个二维数组
    public static int[][] getArr3() {
        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        return arr;
    }

    //返回一个无序数组
    public static int[] getArrNOreder() {
        int arr[] = {1, 4, 6, 2, 7, 8, 3, 9, 5, 10};
        return arr;
    }

    // 打印一维数组
    public static void printarr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    //打印二维数组
    public static void printarr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    //打印链表
    public static void printNode(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    //打印集合
    public static void printList(List list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }

    //十进制转二进制
    public static StringBuilder dec2bin(int i) {
        StringBuilder stringBuilder = new StringBuilder();
        if (i < 0) {
            return null;
        }
        while (i != 0) {
            stringBuilder.append(i % 2);
            i /= 2;
        }
        return stringBuilder.reverse();
    }

    //二分查找
    public static int binarysearch(int nums[], int target) {
        java.util.Arrays.sort(nums);
        if (nums.length < 0) {
            return -1;
        }
        int st = 0;
        int ed = nums.length - 1;
        int mid = (st + ed) / 2;
        while (st < ed) {
            if (nums[mid] > target) {
                ed = mid - 1;
                mid = (st + ed) / 2;
            }
            if (nums[mid] < target) {
                st = mid + 1;
                mid = (st + ed) / 2;
            }
            if (nums[mid] == target) {
                return mid;
            }
        }
        return -1;
    }
}
