class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        int ogMax = -1;
        List<Boolean> res = new ArrayList<>();

        for (int c : candies) {
            ogMax = Math.max(ogMax, c);
        }

        for (int i = 0; i < n; i++) {
            if (candies[i] + extraCandies >= ogMax) res.add(true);
            else res.add(false);
        }

        return res;
    }
}
