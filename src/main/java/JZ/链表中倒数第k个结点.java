package JZ;

import java.awt.*;

/**
 * Created by lenovo on 20/7/19.
 */
public class 链表中倒数第k个结点 {

    /*
    *   输入一个链表，输出该链表中倒数第k个结点。
     */
    public static void main(String[] args) {
        ListNode node = new ListNode(-1);
        ListNode p = node;
        for (int i = 0; i < 3; i++) {
            p.next = new ListNode(i);
            p = p.next;

        }

        ListNode res = FindKthToTail(node.next, 2);
        System.out.println(res.val);
    }

    public static ListNode FindKthToTail(ListNode head, int k) {
        if (head == null) return head;
        int len = 1;
        if (k <= 0) {
            return null;
        }
        ListNode tem = head;
        while (tem.next != null) {
            len++;
            tem = tem.next;
        }
        if (k > len) {
            return null;
        }
        ListNode first = head;
        ListNode second = head;
        for (int i = 1; i < k; i++) {
            first = first.next;
        }
        while (first.next != null) {
            first = first.next;
            second = second.next;
        }
        return second;
    }
}
