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
    public ListNode mergeNodes(ListNode head) {
        int acc =0;
        ListNode out= new ListNode(0); 
        ListNode curr=out;
        ListNode ptr = head.next;
        boolean first=true;
        while(ptr!=null){
            
            if (ptr.val == 0) {
                if (acc > 0) {
                    curr.next = new ListNode(acc);
                    curr = curr.next;
                }
                acc = 0; 
            } else {
                acc += ptr.val; 
            }
            ptr = ptr.next; 
        }
        
        
        return out.next;
    }
}
