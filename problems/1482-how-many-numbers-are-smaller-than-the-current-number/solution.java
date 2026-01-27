class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        Map<Integer, Integer> hm = new HashMap<>();
        int[] res = Arrays.copyOf(nums, nums.length);
        Arrays.sort(res);

        int[] ans = new int[nums.length];

        hm.put(res[0], 0);
        int compare = res[0];
        
        for (int i = 1; i < res.length; i++) {
            if (res[i] > compare) {
                hm.put(res[i], i);
                compare = res[i];
            }
        }

        int j = 0;

        for (int num : nums) {
            ans[j] = hm.get(num);
            j++;
        }

        return ans;

    }
}
