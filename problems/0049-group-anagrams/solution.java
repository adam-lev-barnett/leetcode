class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> result = new ArrayList<>();
        Map<String, List<Integer>> indexMap = new HashMap<>();

        List<char[]> charArrays = new ArrayList<>();
        for (String word : strs) {
            char[] orderedCharArray = word.toCharArray();
            Arrays.sort(orderedCharArray);
            charArrays.add(orderedCharArray);
        }

        for (int i = 0; i < charArrays.size(); i++) {
            // Get all the indices of words with the same ordered character array
            String key = String.valueOf(charArrays.get(i));
            if (indexMap.containsKey(key)) {
                indexMap.get(key).add(i);
            }
            else {
                indexMap.put(key, new ArrayList<>());
                indexMap.get(key).add(i);
            }
        }

        for (String key : indexMap.keySet()) {
            List<String> anaGroup = new ArrayList<>();
            for (int index : indexMap.get(key)) {
                anaGroup.add(strs[index]);
            }
            result.add(anaGroup);
        }

        return result;

    }
}
