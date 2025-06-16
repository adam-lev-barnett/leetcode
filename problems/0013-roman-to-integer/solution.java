import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> conv = new HashMap<>();
        int res = 0;
        conv.put('I', 1);
        conv.put('V', 5);
        conv.put('X', 10);
        conv.put('L', 50);
        conv.put('C', 100);
        conv.put('D', 500);
        conv.put('M', 1000);
        s = s.toUpperCase();
        res = conv.get(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            char c = s.charAt(i);
            char d = s.charAt(i - 1);
            res += conv.get(s.charAt(i));

            switch (d) {
                case 'I':
                    if (c == 'V' || c == 'X') res -= 2;
                    break;
                case 'X':
                    if (c == 'L' || c == 'C') res -= 20;
                    break;
                case 'C':
                    if (c == 'D' || c == 'M') res -= 200;
                    break;
                default:
                    break;
            }

            
        }
        return res;
    }
}
