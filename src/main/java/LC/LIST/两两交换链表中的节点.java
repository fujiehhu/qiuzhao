package LC.LIST;

import JZ.ListNode;
import utils.utils;

public class 两两交换链表中的节点 {
    /*
     *给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
     * 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
     *
     * 给定 1->2->3->4, 你应该返回 2->1->4->3.
     */
    public static void main(String[] args) {
        utils.printListNode(swapPairs(utils.getListOrder(5)));
    }

    public static ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        //p的前驱节点
        ListNode pre = new ListNode(-1);
        pre.next = head;
        ListNode p = head;
        ListNode q = head.next;
        //结果返回的头结点
        head = q;
        while (p != null && q != null) {
            // 交换节点
            ListNode tem = p;
            tem.next = q.next;
            q.next = tem;
            pre.next = q;
            //重新给节点赋值
            p = q;
            q = tem;
            pre = tem;
            //交换值
            // int tem = p.val;
            // p.val = q.val;
            // q.val = tem;
            if (p.next.next != null) {
                p = p.next.next;
            } else {
                return head;
            }
            if (q.next.next != null) {
                q = q.next.next;
            } else {
                return head;
            }
        }
        return head;
    }
}
