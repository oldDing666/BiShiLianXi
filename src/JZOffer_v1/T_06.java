package JZOffer_v1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/9/15 3:04 下午
 */

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class T_06 {
    public int[] reversePrint(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode cur = head;
        while (cur != null) {
            list.add(cur.val);
            cur = cur.next;
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = list.get(list.size() - 1 - i);
        }
        return res;
    }

    public int[] reversePrintV2(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        ListNode nxt = null;
        int len = 0;
        while (cur != null) {
            nxt = cur.next;
            cur.next = pre;
            pre = cur;
            cur = nxt;
            len++;
        }

        int[] res = new int[len];
        int index = 0;
        while (pre != null) {
            res[index] = pre.val;
            pre = pre.next;
            index++;
        }
        return res;
    }

    public ListNode reverseListNode(ListNode head) {
        // 定义前中后三个变量
        ListNode pre = null;
        ListNode cur = head;
        ListNode nxt = null;

        while (cur != null) {
            nxt = cur.next;
            cur.next = pre;
            pre = cur;
            cur = nxt;
        }
        // 反转链表后，pre成为了头节点
        return pre;
    }
}
