class Solution {
    private int gcd(int a,int b){
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode first=head;
        while(first.next!=null){
           ListNode temp = new ListNode(gcd(first.val,first.next.val));
           temp.next=first.next;
           first.next=temp;
            first=temp.next;
        }
        return head;
    }
}