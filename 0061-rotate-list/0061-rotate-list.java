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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null|| head.next ==null) return head;
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        k=k%count;
        temp=head;
        for(int i=0;i<k;i++){
            ListNode before =null;
            while(temp.next!=null){
                before=temp;
                temp=temp.next;
            }
            temp.next=head;
            head=temp;
            before.next=null;
            temp=head;
        }
        return head;
    }
}