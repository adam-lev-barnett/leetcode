class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        Set<Integer> hs = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            hs.add(nums[i]);
        }

        List<Integer> result = new ArrayList<>();

        for (int j = 1; j <= nums.length; j++) {
            if (!hs.contains(j)) {
                result.add(j);
            }
        }

        return result;

    }
}
