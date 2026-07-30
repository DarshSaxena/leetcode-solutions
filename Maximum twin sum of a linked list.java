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
    public int pairSum(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        ListNode temp=null;
        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        temp=slow.next;
        slow.next=null;
        
      ListNode  c=temp;
      ListNode p=null;
      ListNode n=null;
      while(c!=null){
        n=c.next;
        c.next=p;
        p=c;
        c=n;
      }
      int max=0;
      ListNode i=head;
      ListNode j=p;
      while(i!=null && j!=null){
        int sum=i.val+j.val;
       max=Math.max(sum,max);
       i=i.next;
       j=j.next;

      }
      return max;
    }
}
