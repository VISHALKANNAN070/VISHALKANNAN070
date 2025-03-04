class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode n1 = list1;
        ListNode n2 = list1;
        for (int i = 0; i < a - 1; i++) {
            n1 = n1.next;
        }
        for (int i = 0; i <= b; i++) {
            n2 = n2.next;
        }
        ListNode n3 = list2;
        while (n3.next != null) {
            n3 = n3.next;
        }
        n1.next = list2;
        n3.next = n2;

        return list1;
    }
}