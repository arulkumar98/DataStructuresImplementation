package linkedlist.leetcode;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle extends ListNode{

    LinkedListCycle(int x) {
        super(x);
    }

    public ListNode detectCycle(ListNode head) {
        if (head == null){
            return null;
        }
        Set<ListNode> nodes = new HashSet<>();

        while (head != null){
            if (nodes.contains(head)){
                return head;
            }
            nodes.add(head);
            head = head.next;
        }

        return null;
    }
}
