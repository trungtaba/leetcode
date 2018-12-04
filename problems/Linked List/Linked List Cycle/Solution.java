//https://leetcode.com/explore/featured/card/top-interview-questions-easy/93/linked-list/773/

class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null){
            return false;
        }
        
        ListNode slow=head;
        ListNode fast=head;
        
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            
            if(slow==fast){
                return true;
            }
        }
        
        return false;
    }
}

