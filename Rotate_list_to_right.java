/* 
Test Result
61. Rotate List

Given the head of a linked list, rotate the list to the right by k places.

*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null){
            return head;
        }
        if(k == 0){
            return head;
        }
        ListNode current = head;
        ListNode prev = null;
        int n = 0;
        while(current != null){
            n++;
            current = current.next;
        }
        current = head;
        int m = k%n;
        while(m > 0) { 
            current = head;
            while(current.next != null){
                prev = current;
                current = current.next;
            }
            prev.next = null;
            current.next = head;
            head = current;
            m--;
        }
        return head;
}
}
