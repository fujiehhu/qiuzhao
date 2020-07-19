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

    // 打印一维数组
    public static void printarr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    //打印二位数组
    public static void printarr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    //打印链表
    //打印集合
    public static void printlist(List list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}