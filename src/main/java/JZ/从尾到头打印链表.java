package JZ;

import utils.utils;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by lenovo on 20/7/19.
 */
public class 从尾到头打印链表 {
    //    输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
    public static void main(String[] args) {
        ListNode node = utils.utils.getList();
        utils.utils.printList(printListFromTailToHead(node));
    }

    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ListNode p = listNode;
        ArrayList<Integer> list = new ArrayList<>();
        while (p != null) {
            list.add(p.val);
            p = p.next;
        }
        Collections.reverse(list);
        return list;
    }
}
