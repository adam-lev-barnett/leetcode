class Solution {
    public int[] plusOne(int[] digits) {

        int n = digits.length;
        boolean overflows = true;

        for (int i = 0; i < n; i++) {
            if (digits[i] != 9) overflows = false;
        }

        if (overflows) {
            int[] result = new int[n + 1];
            result[0] = 1;
            return result;
        }


        // Simply increment last digit if it isn't 9
        if (digits[n - 1] != 9) {
           int[] result = Arrays.copyOf(digits, n);
           result[n - 1]++;
           return result;
        }

        int[] result = Arrays.copyOf(digits, n);

        int i = n - 1;

        while (i >= 0 && digits[i] == 9) {
            result[i] = 0;
            result[i - 1]++;
            result[i - 1] %= 10;
            if (result[i - 1] != 0) break;
            i--;
        }

        return result;
        
    }
}
