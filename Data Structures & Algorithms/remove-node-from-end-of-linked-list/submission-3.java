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
        ListNode dummy = new ListNode(0,head);

        ListNode pointer1 = dummy;
        ListNode pointer2 = dummy;

        while(n > 0){
            pointer1 = pointer1.next;
            n--;
        }

        while(pointer1.next != null){
            pointer2 = pointer2.next;
            pointer1 = pointer1.next;
        }

        pointer2.next = pointer2.next.next;
        return dummy.next;
    }
}
