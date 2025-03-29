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
        ListNode l3 = new ListNode(l1.val + l2.val); 
        ListNode startNode = l3;
        ListNode returnNode = l3;

        l1 = l1.next;
        l2 = l2.next;

        while (l1 != null && l2 != null) {
            l3.next = new ListNode(l1.val + l2.val); 
            l1 = l1.next;
            l2 = l2.next;
            l3 = l3.next;
        }

        while (l1 != null) {
            l3.next =  new ListNode(l1.val);
            l1 = l1.next;
            l3 = l3.next;
        }

        while (l2 != null) {
            l3.next = new ListNode(l2.val);
            l2 = l2.next;
            l3 = l3.next;
        }

        l3 = startNode;

        while (l3.next != null) {
            if (l3.val >= 10) {
                l3.val = l3.val % 10;
                l3.next.val += 1;
            }
            l3 = l3.next;
        }

        if (l3.val >= 10) {
            l3.val = l3.val % 10;
            l3.next = new ListNode(1);
        }

        return startNode;
    }
}
