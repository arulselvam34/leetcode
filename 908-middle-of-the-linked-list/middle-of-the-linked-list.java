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
    public ListNode middleNode(ListNode head) {
        ListNode t = head;
        ListNode t2 = t;
        while(t2 != null&&t2.next != null){
            t = t.next;
            t2 = t2.next.next;
        } 
        return t;
    }
}