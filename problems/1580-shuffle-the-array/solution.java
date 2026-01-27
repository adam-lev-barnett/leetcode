class Solution {
    public int[] shuffle(int[] nums, int n) {
        int len = nums.length;
        int[] res = new int[len];
        int[] left = Arrays.copyOfRange(nums, 0, n);
        int[] right = Arrays.copyOfRange(nums, n, len);
        
        int i = 0;
        int slow = 0;

        while (i < len) {
            res[i] = left[slow];
            i++;
            res[i] = right[slow];
            i++;
            slow++;
        }

        return res;

    }
}
