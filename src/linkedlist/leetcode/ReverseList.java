package linkedlist.leetcode;

public class ReverseList {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode reversed = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return reversed;
    }

    public ListNode reverse(ListNode node) {
        if (node == null) {
            return null;
        }

        ListNode prev = null;
        ListNode present = node;
        ListNode next = present.next;

        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
        }
        node = prev;
        return node;
    }
}