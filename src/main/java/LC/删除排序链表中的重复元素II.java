package LC;

import JZ.ListNode;
import utils.utils;

public class 删除排序链表中的重复元素II {
    /*
     *给定一个排序链表，删除所有含有重复数字的节点，只保留原始链表中 没有重复出现 的数字。
     *
     * 输入: 1->2->3->3->4->4->5
     * 输出: 1->2->5
     */
    public static void main(String[] args) {
        deleteDuplicates(utils.getDuplicateList());
    }

    //[1,1,1,2,3]
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode p = head;
        ListNode q = head.next;
        while (q != null) {
            while (p == q) {
                q = q.next;
            }
            pre.next = q;
            p = q;
            q = q.next;
        }


        return p.next;
    }
}
