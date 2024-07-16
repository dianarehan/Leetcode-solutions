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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] a ={-1,-1};
        if(head.next==null)
            return a;
        if(head.next.next==null)    
            return a;
        ListNode first=head;
        ListNode second = head.next;
        ListNode third = head.next.next;
        int counter=2;
        ArrayList<Integer> mid = new ArrayList<Integer>();
        while(third!=null){
            if(second.val > third.val && second.val> first.val ||second.val < third.val && second.val< first.val ){
                mid.add(counter);
            }
            counter++;
            first=first.next;
            second=second.next;
            third=third.next;
            
        }
        if (mid.size() < 2) {
            return a;
        }

        Collections.sort(mid);
        int minDistance = Integer.MAX_VALUE;
        for (int i = 1; i < mid.size(); i++) {
            minDistance = Math.min(minDistance, mid.get(i) - mid.get(i - 1));
        }
        int maxDistance = mid.get(mid.size() - 1) - mid.get(0);
        int res [] = new int[2];
        res[0]=minDistance;
        res[1]=maxDistance;
        return res;
    }
    
}
