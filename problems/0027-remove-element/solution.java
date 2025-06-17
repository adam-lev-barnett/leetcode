class Solution {
    public int removeElement(int[] nums, int val) {
        int reader = 0;
        int writer = 0;
        int l = nums.length;
        while (reader < l) {
            if (nums[reader] == val) reader++;
            else {
                nums[writer] = nums[reader];
                writer++;
                reader++;
            }
        }
        return writer;
    }
}
