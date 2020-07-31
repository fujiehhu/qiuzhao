package LC;

import JZ.ListNode;
import com.sun.org.apache.bcel.internal.generic.LNEG;
import utils.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fujie on 20/7/27.
 */
public class 两数相加II {
    //给你两个 非空 链表来代表两个非负整数。数字最高位位于链表开始位置。它们的每个节点只存储一位数字。将这两数相加会返回一个新的链表。
    //你可以假设除了数字 0 之外，这两个数字都不会以零开头。
    //
    //进阶：
    //如果输入链表不能修改该如何处理？换句话说，你不能对列表中的节点进行翻转。


    public static void main(String[] args) {
        ListNode l11 = new ListNode(9);
        ListNode l12 = new ListNode(1);
        ListNode l13 = new ListNode(1);
        ListNode l14 = new ListNode(1);

        ListNode l21 = new ListNode(9);
        ListNode l22 = new ListNode(1);
        ListNode l23 = new ListNode(1);

//        l11.next = l12;
//        l12.next = l13;
//        l13.next = l14;

//        l21.next = l22;
//        l22.next = l23;

        "22".equals("33");
        addTwoNumbers(l11, l21);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        return null;
    }
}
