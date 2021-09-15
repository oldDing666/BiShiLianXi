package JZOffer_v1;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/9/15 5:38 下午
 */
public class T_25 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;

        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
}
