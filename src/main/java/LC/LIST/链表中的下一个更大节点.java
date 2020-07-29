package LC.LIST;

import JZ.ListNode;
import utils.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fujie on 20/7/29.
 */
public class 链表中的下一个更大节点 {
    //输入：[2,7,4,3,5]
    //输出：[7,0,5,5,0]
    public static void main(String[] args) {
        ListNode p1 = new ListNode(2);
        ListNode p2 = new ListNode(7);
        ListNode p3 = new ListNode(4);
        ListNode p4 = new ListNode(3);
        ListNode p5 = new ListNode(5);
        p1.next = p2;
        p2.next = p3;
        p3.next = p4;
        p4.next = p5;

        nextLargerNodes(p1);

    }

    public static int[] nextLargerNodes(ListNode head) {
        int length = 0;
        ListNode p = head;
        List<Integer> res = new ArrayList<>();
        while (p != null) {
            length++;
            res.add(p.val);
            p = p.next;
        }
        System.out.println(res);
        if (length == 0) return new int[]{0};
        if (length == 1) return new int[]{0};
        int i = 0;
        int tem ;
        int res1[] = new int[length];
        while (i < res.size()) {
            tem = res.get(i);
            int q = i+1;
            while (q < res.size()) {
                if (res.get(q) > tem) {
                    res1[i] = res.get(q);
                    break;
                } else {
                    res1[i] = 0;
                }
                q++;
            }
            i++;
        }
        //utils.printarr(res1);
        return res1;

    }
}
