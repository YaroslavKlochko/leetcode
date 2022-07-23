import com.company.algorithms.dataStructures.ListNode;

// create pointer
// go through the nodes
// create a box
// switch values
// return pointer

public class ReverseLinkedList206_1 {

    public static ListNode reverseList1(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;

        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode());
        ListNode listNode2 = new ListNode(2, listNode);
        ListNode listNode3 = new ListNode(3, listNode2);
        ListNode listNode4 = new ListNode(3, listNode3);
    }
}
