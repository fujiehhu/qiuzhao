package LC;

import JZ.ListNode;
import utils.utils;


public class 排序链表 {
    /*
     *   在 O(n log n) 时间复杂度和常数级空间复杂度下，对链表进行排序。
     *
     * 输入: 4->2->1->3
     * 输出: 1->2->3->4
     */
    public static void main(String[] args) {
        //归并排序链表
        ListNode head = utils.getListNorder(15);
        utils.printListNode(head);
        System.out.println();
        utils.printListNode(sortList(head));
    }

    public static ListNode sortList(ListNode head) {
        //归并排序
        //1、分割
        //2、合并
        //头结点为空，或者只有一个节点返回
        if (head == null || head.next == null) {
            return head;
        }
        //找到中点，分割链表
        //快慢指针:奇数个节点找到中点，偶数个节点找到中心左边的节点
        ListNode slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        //第二条链表的头结点
        ListNode p = slow.next;
        slow.next = null;
        //分割
        ListNode left = sortList(head);
        ListNode right = sortList(p);
        ListNode newh = new ListNode(0);//辅助头部
        ListNode res = newh;//返回res.next
        //归并
        while (left != null && right != null) {
            if (left.val <= right.val) {
                newh.next = left;
                left = left.next;
            } else {
                newh.next = right;
                right = right.next;
            }
            newh = newh.next;
        }
        //把left或者right剩余节点加入
        newh.next = left != null ? left : right;
        return res.next;
    }
}
