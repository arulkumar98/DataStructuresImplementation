package linkedlist.leetcode;

public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        for (int i = 0; i < k; i++) {
            ListNode lastNode = findLastNode(head);
            if (prev == null || lastNode == null) return null;
            prev.next = null;
            lastNode.next = head;
            head = lastNode;
        }

        return head;
    }
    ListNode prev = null;
    public ListNode findLastNode(ListNode head) {
        ListNode lastNode = null;
        ListNode temp = head;
        while (temp != null) {
            prev = lastNode;
            lastNode = temp;
            temp = temp.next;
        }
        return lastNode;
    }
}