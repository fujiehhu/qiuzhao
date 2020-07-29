package LC.LIST;

import JZ.ListNode;
import utils.utils;

/**
 * Created by fujie on 20/7/22.
 */
public class 重排链表 {
    /*
    * 给定一个单链表 L：L0→L1→…→Ln-1→Ln ，
    * 将其重新排列后变为： L0→Ln→L1→Ln-1→L2→Ln-2→…
    * 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
    *
    *   给定链表 1->2->3->4, 重新排列为 1->4->2->3.
    *
    */
    public static void main(String[] args) {
        reorderList(utils.getListOrder());
    }

    public static void reorderList(ListNode head) {
        utils.printListNode(head);
        ListNode res = head;
        //先找中点
        //快慢指针
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        //断开链表 ，反转链表
        ListNode seclist = slow.next;
        slow.next = null;
        seclist = reverse(seclist);
        utils.printListNode(seclist);
        utils.printListNode(head);
        while (seclist != null) {
            ListNode p = head.next;
            ListNode q = seclist.next;
            head.next = seclist;
            seclist.next = p;
            head = p;
            seclist = q;
        }
        utils.printListNode(res);
        System.out.println(slow.val);
        head = res;
    }

    static ListNode reverse(ListNode head) {
        if (head.next == null) return head;
        ListNode last = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return last;
    }
}
