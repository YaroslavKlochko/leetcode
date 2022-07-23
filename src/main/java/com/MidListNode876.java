import com.company.algorithms.dataStructures.ListNode;
import java.util.List;

public class MidListNode876 {

    public ListNode middleNode(ListNode head) {
        ListNode current = head;
        ListNode[] returnedFromMiddle = new ListNode[100];
        if (head.next == null) {
            return head;
        }
        int counter = 0;
        while (current != null) {
            returnedFromMiddle[counter++] = current;
            current = current.next;
        }
        return returnedFromMiddle[counter / 2];
    }
}
