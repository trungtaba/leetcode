//https://leetcode.com/problems/add-two-numbers/?fbclid=IwAR1Qo63ebBbAE1jzLt8ESXJUSZLWuHKHaoIKPBdFL5V8YfWQEAmgXrxyvMQ

class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode newHead=new ListNode(0);
        ListNode p1=l1,p2=l2,p3=newHead;
        
        int value=0;
        
        while(p1!=null || p2!=null){
            if(p1!=null){
                value+= p1.val;
                p1=p1.next;
            }
            
            if(p2!=null){
                value+=p2.val;
                p2=p2.next;
            }
            
            p3.next=new ListNode(value%10);
            p3=p3.next;
            
            value/=10;
        }
        
        if(value==1){
            p3.next=new ListNode(1);
        }
        return newHead.next;
        
    }
}
