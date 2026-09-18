class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int[] counts = new int[6];
        int dominoCount = tops.length;
        int flips = -1;

        for (int i = 0; i < tops.length; i++) {
            if (tops[i] == bottoms[i]) counts[tops[i] - 1]++;
            else {
                counts[tops[i] - 1]++;
                counts[bottoms[i] -1]++;
            }
        }

        for (int i = 0; i < counts.length; i++) {
            if (counts[i] == dominoCount) {
                int topFlips = 0;

                int bottomFlips = 0;

                for (int j = 0; j < dominoCount; j++) {
                    if (tops[j] != i + 1) {
                        topFlips++;
                    }
                    if (bottoms[j] != i + 1) {
                        bottomFlips++;
                    }
                }
                if (flips == -1) flips = Integer.MAX_VALUE;
                flips = Math.min(flips, Math.min(topFlips, bottomFlips));
            }
        }

        return flips;
        
    }
}
