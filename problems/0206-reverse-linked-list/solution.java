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
    public ListNode reverseList(ListNode head) {
        List<Integer> nodeVals = new ArrayList<>();
        ListNode dummy = head;
        while (dummy != null) {
            nodeVals.add(dummy.val);
            dummy = dummy.next;
        }
        dummy = head;
        for (int i = nodeVals.size() - 1; i >= 0; i--) {
            dummy.val = nodeVals.get(i);
            dummy = dummy.next;
        }

        return head;
    }
}
