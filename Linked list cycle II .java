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
    public ListNode detectCycle(ListNode head) {
    ListNode fast=head;
    ListNode slow=head;
                ListNode t=head;

    int index=0;
    while(fast!=null && fast.next!=null){
        fast=fast.next.next;
        slow=slow.next;
        if(fast==slow){
            while(slow!=t){
                t=t.next;
                slow=slow.next;
            }
            return t;
        }
    }
    return null;    
    }
}
