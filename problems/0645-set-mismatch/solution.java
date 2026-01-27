class Solution {
    public int[] findErrorNums(int[] nums) {
        // intialize result array
        int[] res = new int[2];

        // sort to get missing digit
        Set<Integer> set = new HashSet<>();

        set.add(nums[0]);

        for (int i = 1; i < nums.length; i++) {
            if (set.contains(nums[i])) res[0] = nums[i];
            else set.add(nums[i]);
        }

        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) {
                res[1] = i;
                break;
            }
        }

        return res;
    }
}
