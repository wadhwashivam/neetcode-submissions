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
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode secondHalf = slow.next;
        slow.next = null;
        ListNode prev = null;
        while(secondHalf != null){
            ListNode temp = secondHalf.next;
            secondHalf.next = prev;
            prev = secondHalf;
            secondHalf = temp;
        }

        ListNode firstHalf = head;
        secondHalf = prev;
        while(secondHalf != null){
            ListNode temp1 = firstHalf.next;
            ListNode temp2 = secondHalf.next;
            firstHalf.next = secondHalf;
            secondHalf.next = temp1;
            firstHalf = temp1;
            secondHalf = temp2;
        }
    }
}
