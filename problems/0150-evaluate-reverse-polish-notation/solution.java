class Solution {

    static Set<String> symbols = new HashSet<>();

    static {
        symbols.add("+");
        symbols.add("-");
        symbols.add("/");
        symbols.add("*");
    }

    public int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();



        int i = 0;

        while (i < tokens.length) {
            if (symbols.contains(tokens[i])) {
                int y = stack.pop();
                int x = stack.pop();
                stack.push(performExp(tokens[i], x, y));
            }
            else stack.push(Integer.parseInt(tokens[i])); 
            i++;
        }

        int sum = 0;

        while (!stack.isEmpty()) {
            sum += stack.pop();
        }

        return sum;
        
    }

    private int performExp(String op, int x, int y) {

        switch (op) {
            case "+":
                return x + y;
            
            case "-":
                return x - y;

            case "/":
                return x / y;

            default:
                return x * y; 
        }

    }
}
