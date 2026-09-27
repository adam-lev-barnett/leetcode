class Solution {
    public String reverseVowels(String s) {

        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (vowels.contains(Character.toLowerCase(c))) {
                stack.push(c);
            }
        }

        if (stack.isEmpty()) return s;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (vowels.contains(Character.toLowerCase(c))) {
                sb.append(stack.pop());
            }
            else sb.append(c);
        }

        return sb.toString();
        
        
    }
}
