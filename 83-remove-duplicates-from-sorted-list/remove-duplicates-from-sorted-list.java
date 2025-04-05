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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode t = head;
        if (head == null){
            return head;
        }
        while(t.next!= null){
            if (t.val != t.next.val){
                t = t.next;
            }
            else{
                t.next = t.next.next;
            }
        }
        return head;
    }
}