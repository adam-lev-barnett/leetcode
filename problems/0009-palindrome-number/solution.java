class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        if (x < 10) return true;
        int dummy = x;
        int digitCount = 0;
        while (dummy > 0 ) {
            dummy /= 10;
            digitCount++;
        }
        dummy = x;
        long reverse = 0;
        while (dummy > 0) {
            reverse += ((dummy % 10) * Math.pow(10, digitCount - 1));
            digitCount--;
            dummy /= 10;
        }

        return x == reverse;
        
    }
}
