package utils;

import JZ.ListNode;

import java.util.List;

/**
 * Created by lenovo on 20/7/19.
 */
public class Utils {

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
}
