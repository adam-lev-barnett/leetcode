import java.util.ArrayDeque;

class Solution {
    public boolean isPalindrome(int x) {
        // Discount negatives
        if (x < 0) return false;
        ArrayDeque<Integer> digits = new ArrayDeque<>();
        int digitCount = 0;
        while (x > 0) {
            digits.add(x % 10);
            x /= 10;
        }

        if (digits.size() % 2 == 0) {
            while (!digits.isEmpty()) {
                int y = digits.pollFirst();
                int z = digits.pollLast();
                if (y != z) return false;
            }
            return true;
        }

        else {
            while (digits.size() > 1) {
                int y = digits.pollFirst();
                int z = digits.pollLast();
                if (y != z) return false;
            }
            return true;
        }
        
    }
}
