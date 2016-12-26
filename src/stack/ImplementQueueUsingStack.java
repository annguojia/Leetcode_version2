package stack;

import java.util.Stack;

/**
 * Created by ann on 11/30/15.
 */
public class ImplementQueueUsingStack {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    // Push element x to the back of queue.
    public void push(int x) {
        stack1.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        while(!stack1.isEmpty()) {
            int cur = stack1.pop();
            stack2.push(cur);
        }
        stack1.pop();
        while(!stack2.isEmpty()) {
            int temp = stack2.pop();
            stack1.push(temp);
        }
    }

    // Get the front element.
    public int peek() {
        while(!stack1.isEmpty()) {
            int cur = stack1.pop();
            stack2.push(cur);
        }
        int res = stack1.pop();
        stack2.push(res);
        while(!stack2.isEmpty()) {
            int temp = stack2.pop();
            stack1.push(temp);
        }
        return res;

    }

    // Return whether the queue is empty.
    public boolean empty() {
        return stack1.isEmpty();
    }
}
