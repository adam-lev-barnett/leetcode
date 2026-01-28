class Solution {

    List<String> stackInstructions = new ArrayList<>();
    List<Integer> compare = new ArrayList<>();
    List<Integer> stack = new ArrayList<>();

    public List<String> buildArray(int[] target, int n) {
        
        int j = 0;

        for (int i = 1; i <= n && i <= target[target.length - 1]; i++) {
            this.push(i);
            if (target[j] != stack.getLast()) this.pop();
            else j++;
        }

        return stackInstructions;

    }

    public void push(int i) {
        stack.add(i);
        stackInstructions.add("Push");
    }

    public void pop() {
        stack.removeLast();
        stackInstructions.add("Pop");
    }

}
