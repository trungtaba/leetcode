//https://leetcode.com/problems/middle-of-the-linked-list/

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
        ListNode first=head;
        ListNode second=head;
        while(true){
            if(second.next!=null){
                System.out.println("first:"+first.val);
                System.out.println("second:"+second.val);
                first=first.next;
                if(second.next.next!=null)
                    second=second.next.next;
            }else break;
        }
        
        return first;
    }
}