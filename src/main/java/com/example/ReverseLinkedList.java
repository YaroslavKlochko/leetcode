package com.example;

//algorithm:

// create pointer
// go through the nodes
// create a box
// switch values
// return pointer

import java.util.List;

// create starting point
// make a loop
// make another box and make a step inside the loop
// replace values 3 times

public class ReverseLinkedList {

    public static ListNode reverseList1(ListNode head) {
        ListNode prev = null;
        while(head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }



    //NULL - 1 - 2 - 3 - 4 - 5
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;

        while (head != null) {
            ListNode next = head.next; // 2  3
            head.next = prev; // null 1
            prev = head; // 1 2
            head = next; // 2 3
        }
        return prev;
    }


// next = 2
// 1-> null
//prev = 1
// head =2

    //2nd:
//now, next = 3
// 2->1 (remember 1 already points to null)
// prev = 2
// head = 3
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode());
        ListNode listNode2 = new ListNode(2, listNode);
        ListNode listNode3 = new ListNode(3, listNode2);
        ListNode listNode4 = new ListNode(3, listNode3);
    }
}