package LC;

import JZ.ListNode;
import utils.utils;

public class 合并两个有序链表 {
    /*
     * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
     *
     * 输入：1->2->4, 1->3->4
     * 输出：1->1->2->3->4->4
     */
    public static void main(String[] args) {

        ListNode l1 = utils.getListOrder(3);
        ListNode l2 = utils.getListOrder(5);
        utils.printListNode(l1);
        utils.printListNode(l2);
        utils.printListNode(mergeTwoLists(l1, l2));
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode h = new ListNode(0);
        ListNode res = h;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                h.next = l1;
                l1 = l1.next;
            } else {
                h.next = l2;
                l2 = l2.next;
            }
            h = h.next;
        }
        h.next = l1 != null ? l1 : l2;
        return res.next;
    }
}
