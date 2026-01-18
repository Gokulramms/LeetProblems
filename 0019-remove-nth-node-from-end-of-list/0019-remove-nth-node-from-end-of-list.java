class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode d = new ListNode(0, head);
        ListNode f = d, s = d;

        for (int i = 0; i <= n; i++) f = f.next;

        while (f != null) {
            f = f.next;
            s = s.next;
        }

        s.next = s.next.next;
        return d.next;
    }
}
