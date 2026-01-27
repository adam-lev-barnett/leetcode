class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int i = 0;
        int localCons = 0;
        int maxCons = 0;

        while (i < nums.length) {
            if (nums[i] == 1) {
                localCons++;
            }

            else {
                if (localCons > maxCons) maxCons = localCons;
                localCons = 0;
            }
            i++;
        }
        if (localCons > maxCons) maxCons = localCons;

        return maxCons;
    }
}
