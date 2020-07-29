package LC.LIST;

import JZ.ListNode;
import utils.utils;

/**
 * Created by fujie on 20/7/27.
 */
public class 链表求和 {
//    给定两个用链表表示的整数，每个节点包含一个数位。
//    这些数位是反向存放的，也就是个位排在链表首部。
//    编写函数对这两个整数求和，并用链表形式返回结果。

    //    输入：(7 -> 1 -> 6) + (5 -> 9 -> 2)，即617 + 295
//    输出：2 -> 1 -> 9，即912
    public static void main(String[] args) {
        ListNode l21 = new ListNode(1);

        ListNode l11 = new ListNode(9);
        ListNode l12 = new ListNode(8);


        l11.next = l12;

        addTwoNumbers(l11, l21);

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) return l1;
        if (l2 == null) return l2;
        ListNode res1 = l1;
        ListNode res2 = l2;
        int jinwei = 0;
        while (l1 != null && l2 != null) {
            int res = l1.val + l2.val + jinwei;

            if (res > 9) {
                l2.val = res - 10;
                l1.val = res - 10;
                jinwei = 1;
            } else {
                l2.val = res;
                l1.val = res;
                jinwei = 0;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        //没有进位
        if (jinwei == 0) {
            utils.printListNode(l1 == null ? res2 : res1);
            return l1 == null ? res2 : res1;
        } else {
            //l1为空
            if (l1 == null && l2 != null) {
                while (jinwei == 1) {
                    int tem = jinwei + l2.val;
                    if (tem > 9 && l2.next != null) {
                        l2.val = tem - 10;
                        l2 = l2.next;
                    } else if (tem > 9 && l2.next == null) {
                        l2.val = tem - 10;
                        l2.next = new ListNode(1);
                        jinwei = 0;
                    } else {
                        l2.val = tem;
                        jinwei = 0;
                    }
                }
                utils.printListNode(res2);
                return res2;
            } else if (l2 == null && l1 != null) {
                while (jinwei == 1) {
                    int tem = jinwei + l1.val;
                    if (tem > 9 && l1.next != null) {
                        l1.val = tem - 10;
                        l1 = l1.next;
                    } else if (tem > 9 && l1.next == null) {
                        l1.val = tem - 10;
                        l1.next = new ListNode(1);
                        jinwei = 0;
                    } else {
                        l1.val = tem;
                        jinwei = 0;
                    }
                }
                utils.printListNode(res1);
                return res1;
            } else {
                ListNode q = res1;
                while (q.next != null) {
                    q = q.next;
                }
                q.next = new ListNode(1);
                utils.printListNode(res1);
                return res1;
            }
        }


    }
}
