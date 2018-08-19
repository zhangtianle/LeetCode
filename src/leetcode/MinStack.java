package leetcode;

import java.util.Stack;

public class MinStack {
    Stack<Integer> s;
    Stack<Integer> min;
    /** initialize your data structure here. */
    public MinStack() {
        s = new Stack<>();
        min = new Stack<>();
    }

    public void push(int x) {
        if (min.empty() || x <= min.peek()) {
            min.push(x);
        }
        s.push(x);
    }

    public void pop() {
        if (!s.empty()) {
            int p = s.pop();
            if (p == min.peek()) {
                min.pop();
            }
        }
    }

    public int top() {
        return s.peek();
    }

    public int getMin() {
        return min.peek();
    }
}
