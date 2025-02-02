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
    public ListNode deleteMiddle(ListNode head) {
        
        if(head==null || head.next==null)
            return null;
        
        ListNode slow = head;
        ListNode fast = head;
        ListNode oneBeforeSlow = null;
        ListNode oneAfterSlow = null;

        while(fast!=null && fast.next!=null){
            oneBeforeSlow = slow;
            slow = slow.next;
            oneAfterSlow = slow.next;
            
            fast = fast.next.next;
        }

        // Slow is right now holding the middle element
        oneBeforeSlow.next = oneAfterSlow; // Or OneBeforeSlow.next = slow.next;
        return head;
    }
}
