class Solution {
    public int maxArea(int[] height) {
        int p1 = 0;
        int p2 = height.length - 1;
        int diff = (p2 - p1);
        int maxDepth = (diff * Math.min(height[p1], height[p2]));
        while (p1 <= p2) {
            int depth = ((p2 - p1) * Math.min(height[p1], height[p2]));
            if (depth > maxDepth) maxDepth = depth;
            if (height[p1] < height[p2]) {
                p1++;
            }
            else p2--;
        }
        return maxDepth;
    }
}
