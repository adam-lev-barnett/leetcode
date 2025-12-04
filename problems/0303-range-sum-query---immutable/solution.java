class NumArray {

    List<Integer> prefixSums = new ArrayList<>();

    public NumArray(int[] nums) {
        int total = 0;
        
        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
            prefixSums.add(total);
        }
        
    }
    
    public int sumRange(int left, int right) {
        int fullPrefixSum = prefixSums.get(right);
        int toSubtract = left > 0 ? prefixSums.get(left - 1) : 0;

        return fullPrefixSum - toSubtract;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
