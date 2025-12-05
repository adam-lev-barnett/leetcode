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
    public int pairSum(ListNode head) {
        Map<Integer, Integer> sumMap = new HashMap<>();

        int i = 0;
        int maxSum = 0;
        ListNode fast = head;
        ListNode slow = head;
        ListNode nFinder = head;

        while (nFinder != null) {
            sumMap.put(i, nFinder.val);
            i++;
            nFinder = nFinder.next;
        }

        int n = i;

        System.out.println("n = " + n + sumMap.keySet().toString());

        for (int j = 0; j < n / 2; j++) {
            int lowIndexNode = sumMap.get(j);
            int highIndexNode = sumMap.get(n - 1 - j);
            if (lowIndexNode + highIndexNode > maxSum) maxSum = lowIndexNode + highIndexNode;
        }

        return maxSum;

    }
}
