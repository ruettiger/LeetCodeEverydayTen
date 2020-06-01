package com.rudy.study.oneday;

import com.rudy.study.tools.ListNode;

import java.awt.*;
import java.util.ArrayList;
/*2. 两数相加
给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。

如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。

您可以假设除了数字 0 之外，这两个数都不会以 0 开头。

示例：

输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
输出：7 -> 0 -> 8
原因：342 + 465 = 807
 */

/*
解法总结：
1.数学相加模拟
2.英文版最高评价
3.递归解法
时间复杂度 O(max（m.n））
空间复杂度O(max（m，n）+1)
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode(0);
        ListNode curr = listNode;
        int carray = 0;
        while (l1 != null || l2 != null) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            curr.next = new ListNode((x + y + carray) % 10);
            curr = curr.next;
            carray = (x + y + carray) / 10;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        if (carray != 0) listNode.next = new ListNode(carray % 10);
        return listNode.next;
    }

    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode(0);
        ListNode curr = listNode;
        int carray = 0;
        while (l1 != null || l2 != null || carray != 0) {
            if (l1 != null) {
                carray += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                carray += l2.val;
                l2 = l2.next;
            }
            curr.next = new ListNode(carray % 10);
            curr = curr.next;
            carray = carray / 10;
        }
        return listNode.next;
    }
}
