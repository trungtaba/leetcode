//https://leetcode.com/explore/featured/card/top-interview-questions-easy/93/linked-list/603/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count=0;
        
        ListNode newHead1=head;
        ListNode newHead2=head;
        while(newHead1.next!=null){
            count++;
            newHead1=newHead1.next;
        }
        count++;
        int index=0;
        if(count<n)return null;
        if(count==n) return head.next;
        while(index<count-n-1){
            newHead2=newHead2.next;
            index++;
        }
        newHead2.next=newHead2.next.next;
        return head;
    }
}