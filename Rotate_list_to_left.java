// Given the head of a linked list, rotate the list to the right by k places.

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
        int m = k % n;
        ListNode current = head;
        ListNode first = head;
        int n = 0;
        while(current != null){
            n++;
            current = current.next;
        }
        while(m > 0){
        current = head;
        while(current.next != null){
            current =  current.next;
        }
        current.next = head;
        first.next = null;
        m--;
        }
        return head;

}
}
