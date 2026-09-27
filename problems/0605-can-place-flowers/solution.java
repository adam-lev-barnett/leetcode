class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        
        int[] tempbed = Arrays.copyOf(flowerbed, flowerbed.length);
        int canFill = 0;

        for (int i = 0; i < tempbed.length; i++) {
            if (tempbed[i] == 0) {
                boolean emptyLeft = (i == 0 || tempbed[i - 1] == 0);
                boolean emptyRight = (i == tempbed.length - 1 || tempbed[i + 1] == 0);
                if (emptyLeft && emptyRight) {
                    tempbed[i] = 1;
                    canFill++;
                }
            }
        }

        return n <= canFill;

        
    }
}
