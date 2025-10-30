class MinStack {
    Node head;
    int min;

    public MinStack() {
        this.head = null;
        min = Integer.MAX_VALUE;
    }
    
    public void push(int val) {
        if (head == null) {
            head = new Node(null, val, val);
            min = val;
        }
        else {
            if (val < min) min = val;
            head = new Node(head, val, min);
        }
    }
    
    public void pop() {
        if (head == null) return;
        head = head.next;
        if (head != null) min = head.min;
    }
    
    public int top() {
        return head.val;
    }
    
    public int getMin() {
        return head.min;

    }

    private class Node {
        Node next;
        int val;
        int min;

        public Node (Node next, int val, int min) {
            this.next = next;
            this.val = val;
            this.min = min;
        }

    }

}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
