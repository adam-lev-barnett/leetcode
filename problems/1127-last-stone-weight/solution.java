import java.util.PriorityQueue;
import java.util.Collections;

class Solution {

    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> stoneQ = new PriorityQueue<>(Collections.reverseOrder());

        for (int stone : stones) {
            stoneQ.add(stone);
        }
        
        int y; // y is the biggest stone
        int x; // x is second biggest
        // int size = stoneQ.size();

        while (stoneQ.size() > 1) {
            // System.out.println("Queue: " + stoneQ);
            y = stoneQ.poll();
            x = stoneQ.poll();
            if (x != y) {
                y -= x;
                if (y > 0) stoneQ.add(y);
            }
        }
        if (stoneQ.isEmpty()) return 0;
        else return stoneQ.poll();
    }
}
