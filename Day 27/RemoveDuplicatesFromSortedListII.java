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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-1, head);
        ListNode prev = dummy;
        ListNode temp = head;
        while(temp!=null){
            while(temp.next!=null && temp.next.val == temp.val){
                temp=temp.next;
            }
            if(prev.next==temp){
                prev = temp;
            }
            else{
                prev.next = temp.next;
            }
            temp = temp.next;
        }
        return dummy.next;
        
    }
}
