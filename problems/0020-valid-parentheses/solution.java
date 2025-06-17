import java.util.Stack;
import java.util.HashMap;

class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> symbols = new HashMap<>();
        symbols.put('{', '}');
        symbols.put('[', ']');
        symbols.put('(', ')');

        Stack<Character> q = new Stack<>();
        if (!symbols.containsKey(s.charAt(0))) return false;
        q.push(s.charAt(0));

        int i = 1;
        while (i < s.length()) {
            char curr = s.charAt(i);
            if (symbols.containsKey(curr)) q.push(curr);
            else {
                if (q.isEmpty()) return false;
                if (symbols.get(q.pop()) != curr) return false;
            }
            i++;
        }
        if (q.isEmpty()) return true;
        return false;
        }
    }
