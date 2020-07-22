package LC;

import JZ.ListNode;
import utils.utils;

/**
 * Created by fujie on 20/7/21.
 */
public class 反转链表II {
    /*
    * 反转从位置 m 到 n 的链表。请使用一趟扫描完成反转。
    *
    * 说明:
    * 1 ≤ m ≤ n ≤ 链表长度。
    * 示例:
    * 输入: 1->2->3->4->5->NULL, m = 2, n = 4
    * 输出: 1->4->3->2->5->NULL
    *
    */
    public static void main(String[] args) {
        utils.printListNode(reverseBetween(utils.getListOrder(), 1, 2));
        utils.printListNode(utils.reverse(utils.getListOrder()));


    }

    public static ListNode reverseBetween(ListNode head, int m, int n) {
        utils.printListNode(head);
        if (head == null || head.next == null) {
            return head;
        }

        //返回的链表头部
        ListNode nhead = new ListNode(-1);
        nhead.next = head;

        //找到第m-1个节点,记录第m个节点的前驱
        ListNode mpre = new ListNode(-1);
        mpre.next = head;
        int i = 1;
        while (i < m) {
            i++;
            head = head.next;
            mpre = mpre.next;
        }
        //记录第m个节点
        ListNode mNode = head;
        //反转链表
        ListNode p = head;
        ListNode q = head.next;
        ListNode r = head.next;
        while (i < n) {
            r = q.next;

            q.next = p;

            p = q;
            q = r;
            i++;

        }
        mpre.next = p;
        mNode.next = q;
        //判断是否从第一个节点开始
        if (nhead.val == mpre.val) {
//            utils.printListNode(mpre);
            return mpre.next;
        } else {
//            utils.printListNode(nhead);
            return nhead.next;
        }


    }
}


