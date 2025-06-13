import java.util.HashMap;

class Solution {

    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> chars = new HashMap<>();
        int start = 0;
        int pfxLen = 0;

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            if (chars.containsKey(current)) {
                if (chars.get(current) >= start) {
                    start = chars.get(current) + 1;
                }    
            }

            pfxLen = Math.max(pfxLen, (i - start) + 1);
            chars.put(current, i);
        }

        return pfxLen;
    }

}
