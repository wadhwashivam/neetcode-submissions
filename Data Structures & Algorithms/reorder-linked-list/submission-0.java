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
    public void reorderList(ListNode head) {

        ListNode pointerFromStart = head;
        ListNode pointerFromEnd = head;

        while(pointerFromEnd.next != null){
            pointerFromEnd = pointerFromEnd.next;
        }
        while(pointerFromStart != pointerFromEnd && pointerFromStart.next != pointerFromEnd){
            ListNode temp = pointerFromStart.next;
            pointerFromStart.next = pointerFromEnd;

            ListNode prev = temp;
            while(prev.next != pointerFromEnd){
                prev = prev.next;
            }

            prev.next = null;

            pointerFromEnd.next = temp;

            pointerFromStart = temp;;
            pointerFromEnd = prev;
        }
    }
}
