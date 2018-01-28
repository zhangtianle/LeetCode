package codingInterviews;

import java.util.Stack;

public class MinInStack {

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> stackMin = new Stack<>();
    int min = Integer.MAX_VALUE;

    public void push(int node) {
        stack.push(node);
        if (min > node) {
            stackMin.push(node);
            min = node;
        } else {
            stackMin.push(min);
        }
    }

    public void pop() {
        if (stackMin.size() != 0 && stack.size() != 0) {
            stack.pop();
            stackMin.pop();
        }
    }

    public int top() {
        if (stackMin.size() != 0 && stack.size() != 0) {
            return stack.peek();
        } else {
            return -1;
        }
    }

    public int min() {
        if (stackMin.size() != 0) {
            return stackMin.peek();
        } else {
            return -1;
        }
    }

}
