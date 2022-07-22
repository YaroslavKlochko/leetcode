package com.example;

import com.example.dataStructures.ListNode;

public class FloydCycleLoop {


    public void findCycleLoop(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                removeLoop(slow);
                return;
            }

        }
    }

    private void removeLoop(ListNode slow) {
        ListNode temp = slow;
        while (slow.next != temp) {
            temp = temp.next;
            slow = slow.next;
        }
        slow.next = null;
    }
}
