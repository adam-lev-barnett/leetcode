class Solution {
    public boolean increasingTriplet(int[] nums) {
        int low = Integer.MAX_VALUE;
        int med = Integer.MAX_VALUE;

        // Find 
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= low) low = nums[i];
            else if (nums[i] <= med) med = nums[i];

            // If the final number is never larger than low or medium, the else block never activates
            else return true;
        }

        return false;
        
    }
}


