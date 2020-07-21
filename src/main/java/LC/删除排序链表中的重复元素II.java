package LC;

import JZ.ListNode;
import utils.utils;

import java.util.*;

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
        ListNode tem = new ListNode(0);
        ListNode res = tem;
        Map<Integer, Integer> map = new LinkedHashMap<>();
        while (head != null) {
            if (!map.containsKey(head.val)) {
                map.put(head.val, 0);
            } else {
                map.put(head.val, 1);
            }
            head = head.next;
        }
        System.out.println(map);
        for (Integer k : map.keySet()) {
            if (map.get(k) == 0) {
                tem.next = new ListNode(k);
                tem = tem.next;
            }
        }
        utils.printListNode(res);
        return res.next;
    }
}
