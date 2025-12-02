/* 24. Swap Nodes in Pairs

Given a linked list, swap every two adjacent nodes and return its head. You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)

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
    public ListNode swapPairs(ListNode head) {
       if(head == null || head.next == null){
        return head;
       }
       
        ListNode dummy = new ListNode();
        ListNode prev = dummy;
        ListNode current = head;
        while(current != null && current.next != null){
            prev.next = current.next;
            current.next = current.next.next;
            prev.next.next = current;

            prev = current;
            current = current.next;

        }
        return dummy.next;
    }
}
