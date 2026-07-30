class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null){
            return true;
        }
     ListNode temp=null;
     ListNode fast=head;
     ListNode slow=head;
     while(fast.next!=null && fast.next.next!=null){
        fast=fast.next.next;
        slow=slow.next;}
temp=slow.next;
     slow.next=null;
     ListNode curr=temp;
     ListNode prev=null;
     ListNode next=null;
     while(curr!=null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
     }
     ListNode i=head;
     ListNode j=prev;

     while(i!=null && j!=null){
        if(i.val!=j.val){
            return false;
        }
        i=i.next;
        j=j.next;
     }
     return true;
    }
}
