// create 2 pointers
// iterate, create necessary case and compare
// create 2 base cases;

import com.company.algorithms.dataStructures.ListNode;

public class IntersectionOfTwoLinkedLists160_1 {

    ListNode getIntersection(ListNode headA, ListNode headB) {
        ListNode cur1 = headA;
        ListNode cur2 = headB;
        while (cur1 != null && cur2 != null) {
            if (cur1 == cur2) {
                return cur1;
            }
            cur1 = cur1.next;
            cur2 = cur2.next;
            if (cur1 == null) {
                cur1 = headB;
            } else if (cur2 == null) {
                cur2 = headA;
            }
        }
        return null;
    }


    //I found most solutions here preprocess linked lists to get the difference in len.
    //Actually we don't care about the "value" of difference, we just want to make sure two pointers reach the intersection node at the same time.
    //We can use two iterations to do that. In the first iteration, we will reset the pointer of one linked list to the head of another linked list
    //after it reaches the tail node. In the second iteration, we will move two pointers until they points to the same node.
    //Our operations in first iteration will help us counteract the difference. So if two linked list intersects, the meeting point in second
    //iteration must be the intersection point. If the two linked lists have no intersection at all, then the meeting pointer in second iteration
    // must be the tail node of both lists, which is null

    ListNode getIntersect(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode a = headA;
        ListNode b = headB;

        while (a != b) {
            a = a == null ? headB : a.next;
            b = b == null ? headA : b.next;
        }
        return a;
    }
}
