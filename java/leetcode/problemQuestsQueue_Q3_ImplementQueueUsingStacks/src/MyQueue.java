import java.util.Stack;

class MyQueue {
    private final Stack<Integer> a;
    private final Stack<Integer> b;

    public MyQueue() {
        this.a = new Stack<>();
        this.b = new Stack<>();
    }
    
    public void push(int x) {
        this.a.push(x);
    }
    
    public int pop() {
        if (b.empty()) {
            this.copyStack();
        }
        return this.b.pop();
    }
    
    public int peek() {
        if (b.empty()) {
            this.copyStack();
        }
        return this.b.peek();
    }

    private void copyStack() {
        while (!a.empty()) {
            b.push(a.pop());
        }
    }
    
    public boolean empty() {
        return this.a.empty() && this.b.empty();
    }
}

