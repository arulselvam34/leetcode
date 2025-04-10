/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode t = head;
        ListNode t2 = head;
        while(t2 != null&&t2.next!=null){
            t = t.next;
            t2 = t2.next.next;
            if (t == t2){
                return true;
            }
        } 
        return false;
    }
}