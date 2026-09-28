class Solution {
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            // Shift left to make room for new bit
            result = result << 1;
            result = result | (n & 1);
            // Logical shift n to the right (logical so the sign bit isn't extended)
            n >>>= 1;
        }
        return result;
    }

}
