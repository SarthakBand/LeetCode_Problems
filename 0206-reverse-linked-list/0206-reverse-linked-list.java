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
    public ListNode reverseList(ListNode head) {
        ListNode t1 = null;
        ListNode t2 = head;

        while (t2 != null){
            head = t2.next;
            t2.next = t1;
            t1 = t2;
            t2 = head;
        }
        head = t1;
        return head;
        
    }
}