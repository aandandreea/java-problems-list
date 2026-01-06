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

/*
82. Remove Duplicates from Sorted List II

Given the head of a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list. Return the linked list sorted as well.
*/
class Solution {
    public ListNode partition(ListNode head, int x) {
        if(head == null) {
            return null;
        }
        
        ListNode smallcurr = null;
        ListNode greatercurr = null;

        ListNode smallHead = null;
        ListNode greaterHead = null;


        while(head != null) {
            if(head.val < x) {
                if(smallHead == null) {
                    smallHead = new ListNode(head.val);
                    smallcurr = smallHead;
                } else {
                    ListNode newNode = new ListNode(head.val);
                    smallcurr.next = newNode;
                    smallcurr = smallcurr.next;
                }
            } else {
                if(greaterHead == null) {
                    greaterHead = new ListNode(head.val);
                    greatercurr = greaterHead;
                } else {
                    ListNode newNode = new ListNode(head.val);
                    greatercurr.next = newNode;
                    greatercurr = greatercurr.next;
                }
            }

            head = head.next;
        }

        if(smallHead == null) {
            return greaterHead;
        }
        //guardrails / early break gates / shortcircuit
        if(greaterHead == null) {
            return smallHead;
        }

        // tie list togheter
        // small = 1->2->2
        // greater = 4->3->5
        // smallHead = 1
        // greatHead = 4
        smallcurr.next = greaterHead;

        return smallHead;
    }
}
