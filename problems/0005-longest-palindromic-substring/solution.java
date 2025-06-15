class Solution {
    
    public String longestPalindrome(String s) {
        int[] ansSlice = {0,0};

        for (int i = 0; i < s.length(); i++) {
            
            int oddLen = palHelper(i, i, s);
            int evenLen = palHelper(i, i+1, s);
            int dist = Math.max(oddLen, evenLen);
            if (dist > ansSlice[1] - ansSlice[0] + 1) {
                if (dist % 2 == 1) {
                    dist /= 2;
                    ansSlice[0] = i - dist;
                    ansSlice[1] = i + dist;
                }
                else {
                    dist = (dist / 2) - 1;
                    ansSlice[0] = i - dist;
                    ansSlice[1] = i + dist + 1;
                }
            }

        }
        return s.substring(ansSlice[0], ansSlice[1] + 1);
        
    }

    public int palHelper(int i, int j, String s) {
        int left = i;
        int right = j;
        int pfxSize = 0;

        while ((left >= 0 && right < s.length()) && (s.charAt(left) == s.charAt(right))) {
            right++;
            left--;
        }

        return (right - left) - 1;
    }
}
