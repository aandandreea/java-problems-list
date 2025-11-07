/* Q24. Remove Linked List Elements

Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.*/

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
    public ListNode removeElements(ListNode head, int val) {
       if(head != null){
        head = removeFromHead(head,val);
        head = removeFromInterior(head,val);
       }
       return head;
        
    }
    public ListNode removeFromHead(ListNode head,int val){
        while(head != null && head.val == val){
                ListNode aux = head.next;
                head.next = null;
                head = aux;
            }
            return head;
        }
        
    
    public ListNode removeFromInterior(ListNode head,int val){
        if(head == null){
            return null;
        }
        ListNode prev = head;
        ListNode curr = head.next;
        while(curr != null ){
            if(curr.val == val){
                prev.next = curr.next;
            } else {
                prev = curr;
            }
           
            curr = curr.next;
        }
        return head;
    }
}
