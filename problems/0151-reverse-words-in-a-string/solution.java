class Solution {
    public String reverseWords(String s) {

        String[] words = s.split(" ");
        
        StringBuilder sb = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            String stripped = words[i].strip();
            if (!words[i].isEmpty()) sb.append(words[i].strip()).append(" ");
        }

        return sb.toString().strip();

        
    }
}
