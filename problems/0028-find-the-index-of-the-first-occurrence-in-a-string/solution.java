class Solution {
    public int strStr(String haystack, String needle) {

        char needleStart = needle.charAt(0);
        boolean match = true;
        int hayPointer = findMatchingChar(haystack, needle, 0);
        int dummyPointer = hayPointer;

        if (hayPointer == -1) return -1;

        for (int i = 0; i < needle.length(); i++, dummyPointer++) {
            if (haystack.charAt(dummyPointer) != needle.charAt(i)) {
                match = false;
                break;
            }
        }

        while (!match && (hayPointer < haystack.length() - needle.length())) {
            hayPointer = findMatchingChar(haystack, needle, hayPointer + 1);
            dummyPointer = hayPointer;
            if (hayPointer == -1) return -1;
            match = true;
            if (hayPointer <= haystack.length() - needle.length()) {
                for (int i = 0;  (i < needle.length()); i++, dummyPointer++) {
                    if (haystack.charAt(dummyPointer) != needle.charAt(i)) {
                        match = false;
                        break;
                    }
                }
            }
        }

        return match ? hayPointer : -1;      
    }

    public int findMatchingChar(String haystack, String needle, int hayPointer) {
        while (hayPointer < haystack.length() && haystack.charAt(hayPointer) != needle.charAt(0)) {
            hayPointer++;
        }
        if (hayPointer > (haystack.length() - needle.length())) return -1;
        else return hayPointer;
    }

}
