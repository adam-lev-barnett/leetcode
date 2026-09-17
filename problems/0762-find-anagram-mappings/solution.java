class Solution {
    public int[] anagramMappings(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < nums2.length; i++) {
            if (!map.containsKey(nums2[i])) map.put(nums2[i], new ArrayList<>());
            map.get(nums2[i]).add(i);
        }

        for (int i = 0; i < nums1.length; i++) {
            res[i] = map.get(nums1[i]).get(0);
            if (!map.get(nums1[i]).isEmpty()) map.get(nums1[i]).remove(0);
        }

        return res;
    }
}
