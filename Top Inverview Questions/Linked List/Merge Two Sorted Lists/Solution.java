//https://leetcode.com/explore/featured/card/top-interview-questions-easy/93/linked-list/560/

//Definition for singly-linked list.
class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head=new ListNode(0);
        ListNode result=head;

        
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                result.next=l1;
                l1=l1.next;
            }else{
                result.next=l2;
                l2=l2.next;
            }
            result=result.next;
        }
        
        if(l1!=null){
            result.next=l1;
        }
        
        if(l2!=null){
            result.next=l2;
        }
        
        return head.next;
    }
}

