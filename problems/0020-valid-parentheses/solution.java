import java.util.Stack;

class Solution {
    
    Stack<Character> stack = new Stack<>();
    
    public boolean isValid(String s) {
        if (s.isEmpty()) {
            if (stack.isEmpty()) return true;
            else return false;

        }

        char bracket = s.charAt(0);

        if (bracket == '(' || bracket == '[' || bracket == '{') {
            if (s.length() == 1) return false;
            stack.push(bracket);
        }

        else if (bracket == ')') {
            if (stack.isEmpty()) return false;
            if (stack.pop() != '(') return false;

        }

        else if (bracket == ']') {
            if (stack.isEmpty()) return false;
            if (stack.pop() != '[') return false;
        }

        else if (bracket == '}') {
            if (stack.isEmpty()) return false;
            if (stack.pop() != '{') return false;
        }
        
        if (!s.isEmpty()) return isValid(s.substring(1));
        
        return true;
    }
}
