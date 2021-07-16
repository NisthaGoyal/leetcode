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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;
                
        while (l1 != null && l2 != null) {
            int value = (l1.val + l2.val + carry) % 10;
            carry = (l1.val + l2.val + carry) / 10;
            ListNode result = new ListNode(value);
            current.next = result;
            l1 = l1.next;
            l2 = l2.next;
            current = result;
        }
        
        while (l1 != null) {
            int value = (l1.val + carry) % 10;
            carry = (l1.val + carry) / 10;            
            ListNode result = new ListNode(value);
            current.next = result;
            l1 = l1.next;
            current = result;            
        }
        
        while (l2 != null) {
            int value = (l2.val + carry) % 10;
            carry = (l2.val + carry) / 10;     
            ListNode result = new ListNode(value);
            current.next = result;
            l2 = l2.next;
            current = result;            
        }        
        
        if (carry != 0) {
            ListNode result = new ListNode(carry);
            current.next = result;
            current = result;             
        }
        
        return dummy.next;        
    }
}
