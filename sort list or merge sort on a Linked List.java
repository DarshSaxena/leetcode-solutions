
class Solution {
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
       ListNode fast=head;
       ListNode slow=head;
       while(fast.next!=null && fast.next.next!=null){
        fast=fast.next.next;
        slow=slow.next;
       } 
       ListNode t=slow.next;
       slow.next=null;
       head=sortList(head);
       t=sortList(t);
       ListNode i=head;
       ListNode j=t;
       ListNode d=new ListNode(-1);
       ListNode k=d;
       while(i!=null && j!=null){
        if(i.val<=j.val){
            k.next=i;
            i=i.next;
        }
        else{
            k.next=j;
            j=j.next;
        }
        k=k.next;
       }
       if(i==null){
        k.next=j;}
else{
    k.next=i;
}
return d.next;
       }
    }
