/* 82. Remove Duplicates from Sorted List II

Given the head of a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list. Return the linked list sorted as well.*/

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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode current = head;
        ListNode prev = dummy;
        while(current != null){
            if(current.next != null && current.val == current.next.val){
              int duplicate = current.val; 
              while(current != null && current.val == duplicate){
                current = current.next;
              }
            prev.next = current;
            } else {
                prev = current;
                current = current.next;
            }
        }
        return dummy.next;
    }
}
