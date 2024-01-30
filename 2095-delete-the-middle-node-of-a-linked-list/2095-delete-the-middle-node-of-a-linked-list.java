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
    public ListNode deleteMiddle(ListNode head) {
        if (head.next == null) return null;
        ListNode temp = head;
        ListNode temp2 = head;
        int count = 0;
        while(temp != null) {
            temp = temp.next;
            count++;
        }
        count /= 2;
        for (int i = 0; i < count - 1; i++) {
            temp2 = temp2.next;
        }
        temp2.next = temp2.next.next;
        return head;
    }
}