import com.company.algorithms.dataStructures.ListNode;

import java.util.ArrayList;
import java.util.List;

public class PalindromeLinkedList234_1 {

//    This can be solved by reversing the 2nd half and compare the two halves. Let's start with an example [1, 1, 2, 1].
//    In the beginning, set two pointers fast and slow starting at the head.
//
//            (1) Move: fast pointer goes to the end, and slow goes to the middle.
//            (2) Reverse: the right half is reversed, and slow pointer becomes the 2nd head.
//            (3) Compare: run the two pointers head and slow together and compare.

    // create pointers
    // iterate and make a step
    // create base case
    // reverse
    // re-instantiate pointers
    // create base case
    // make steps

    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        if (fast != null) { // odd nodes: let right half smaller
            slow = slow.next;
        }
        slow = reverse(slow);
        fast = head;

        while (slow != null) {
            if (fast.value != slow.value) {
                return false;
            }
            fast = fast.next;
            slow = slow.next;
        }
        return true;
    }

    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }


    //------------------------------------------------------------------------------------------

    // create a box
    // set pointer
    // iterate and add all values
    // iterate(divide) and check the values


    public boolean isPalindrome1(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode currentNode = head;
        while (currentNode != null) {
            list.add(currentNode.value);
            currentNode = currentNode.next;
        }
        for (int i = 0; i < list.size() / 2; i++) {
            if (list.get(i) != list.get(list.size() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
