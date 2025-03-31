import java.util.ArrayDeque;


class MyStack {
    Queue<Integer> q1 = new ArrayDeque<>();
    Queue<Integer> q2 = new ArrayDeque<>();
    
    public void push(int x) {
        
        if (q1.isEmpty()) { // Add int to q1 if it's empty
            q1.add(x);
            while (!q2.isEmpty()) { // Empty everything in q2 into q1 to maintain reverse order
                q1.add(q2.poll());
            }
        }
        else { // And vice versa
            q2.add(x);
            while (!q1.isEmpty()) {
                q2.add(q1.poll());
            }
        }
    }
    
    public int pop() {
        if (!q1.isEmpty()) return q1.poll();
        else return q2.poll();
    }
    
    public int top() {
        if (!q1.isEmpty()) return q1.peek();
        else return q2.peek();
    }
    
    public boolean empty() {
        if ((q1.isEmpty() && q2.isEmpty()) || (q1 == null && q2 == null)) return true;
        return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
