class FindSumPairs {
    int[] nums1;
    int[] nums2;
    HashMap<Integer, Integer> counts = new HashMap<>();

    public FindSumPairs(int[] nums1, int[] nums2) {
        this.nums1 = nums1;
        this.nums2 = nums2;
        for (int num : nums2) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }
    }
    
    public void add(int index, int val) {
            int oldVal = nums2[index];
            counts.put(val + oldVal, counts.getOrDefault(val + oldVal, 0) + 1);
            counts.put(oldVal, counts.getOrDefault(oldVal, 0) - 1);
            nums2[index] += val;
        }
    
    public int count(int tot) {
        int count = 0;
        for (int num : nums1) {
            int search = tot - num;
            count += counts.getOrDefault(search, 0);
        }
        return count;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */
