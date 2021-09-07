package lc_practice.medium;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/9/3 3:45 下午
 */


class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class LC_92 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
//        ListNode node = null;
//        node.next = head;
        ListNode node = new ListNode(0);
        node.next = head;
        ListNode pre = node;
        for (int i = 0; i < left - 1; i++) {
            pre = pre.next;
        }
        ListNode rightNode = pre;
        for (int i = 0; i < right - left + 1; i++) {
            rightNode = rightNode.next;
        }

        ListNode leftNode = pre.next;
        ListNode curr = rightNode.next;
        // 截出一个子链表
        pre.next = null;
        rightNode.next = null;

        reverseListNode(leftNode);

        pre.next = rightNode;
        leftNode.next = curr;
        return node.next;
    }

    public void reverseListNode(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode nxt = cur.next;
            cur.next = pre;
            pre = cur;
            cur = nxt;
        }
    }
}
