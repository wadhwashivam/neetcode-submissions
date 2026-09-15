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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int total = 0;
        ListNode current = head;

        while(current != null){
            current = current.next;
            total++;
        }

        ListNode dummy = new ListNode(0,head);
        ListNode pointer = dummy;
        for(int i= 0;i<total -n;i++){
            pointer = pointer.next;
        }
        pointer.next = pointer.next.next;
        return dummy.next;
    }

}
