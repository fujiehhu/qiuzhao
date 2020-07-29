package LC.LIST;

import JZ.ListNode;
import utils.utils;

/**
 * Created by fujie on 20/7/22.
 */
public class 反转链表 {

    public static void main(String[] args) {
        utils.printListNode(reverseList(utils.getListOrder()));
    }

    public static ListNode reverseList(ListNode head) {
        if (head == null) return null;
        if (head.next == null) return head;
        ListNode last = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return last;
    }
}
