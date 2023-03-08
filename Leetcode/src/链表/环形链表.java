package 链表;

public class 环形链表 {

    /**
     * Definition for singly-linked list.
     */
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }


        ListNode slow = head;
        ListNode fist = head.next;

        while (fist != null && fist.next != null) {
            if (slow == fist) return true;
            slow = head.next;
            fist = head.next.next;
        }

        return false;
    }
}
