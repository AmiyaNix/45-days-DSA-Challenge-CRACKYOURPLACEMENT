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
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return true;
        
        if(head.next.next == null){
            if(head.val!=head.next.val){
                return false;
            }
            return true;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode secondHalfStart = slow;
        if (fast != null) { //for Even
            secondHalfStart = slow.next;
        }
        ListNode newHead = reverse(secondHalfStart);

        ListNode first = head;
        ListNode second = newHead;
        boolean isPalindrome = true;
        while (isPalindrome && second != null) {
            if (first.val != second.val) {
                isPalindrome = false;
            }
            first = first.next;
            second = second.next;
        }
        reverse(newHead);
        return isPalindrome;
       

    }
    public static ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode temp = head;
        while(temp!=null){
            ListNode front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
            
        }
        return prev;
    }
}
