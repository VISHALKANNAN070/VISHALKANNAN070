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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp = head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        ListNode last = head;
        for(int i=0;i<count-k;i++){
            last=last.next;
        }
        ListNode first = head;
        for(int i=0;i<k-1;i++){
            first = first.next;
        }
        int swap=first.val;
        first.val=last.val;
        last.val=swap;
            
            return head;
    }
}