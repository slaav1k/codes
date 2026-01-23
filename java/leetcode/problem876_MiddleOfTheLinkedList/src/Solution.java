class Solution {
    public ListNode middleNode(ListNode head) {
        int len = 0;
        ListNode cur = head;

        while (cur != null) {
            len += 1;
            cur = cur.next;
        }

        int needNode = len / 2;
        len = 0;

        cur = head;

        while (needNode > len) {
            len += 1;
            cur = cur.next;
        }

        return cur;

    }
}