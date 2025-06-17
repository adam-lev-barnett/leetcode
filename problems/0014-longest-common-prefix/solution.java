class Solution {
    public String longestCommonPrefix(String[] strs) {
        String comp = strs[0];
        String res = "";
        int minLen = Integer.MAX_VALUE;
        for (String str : strs) {
            if (str.length() < minLen) minLen = str.length();
        }
        for (int i = 1; i < strs.length; i++) {
            int j = 0;
            while (j < comp.length() && j < minLen && strs[i].charAt(j) == comp.charAt(j)) {
                res += strs[i].charAt(j);
                j++;
            }
            if (res.equals("")) return res;
            comp = res;
            res = "";
        }
        return comp;
    }
}
