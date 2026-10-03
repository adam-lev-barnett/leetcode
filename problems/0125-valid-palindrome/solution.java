class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();

        // s.length should be recalculated as chars are removed
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                sb.append(c);
            }
        }

        String fwd = sb.toString();
        String bkwd = sb.reverse().toString();

        return fwd.equals(bkwd);
    }
}
