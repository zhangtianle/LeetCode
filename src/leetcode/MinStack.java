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
class MinStack2 {
    long min;
    Stack<Long> stack;

    public MinStack2(){
        stack=new Stack<>();
    }

    public void push(int x) {
        if (stack.isEmpty()){
            stack.push(0L);
            min=x;
        }else{
            stack.push(x-min);//Could be negative if min value needs to change
            if (x<min) min=x;
        }
    }

    public void pop() {
        if (stack.isEmpty()) return;

        long pop=stack.pop();

        if (pop<0)  min=min-pop;//If negative, increase the min value

    }

    public int top() {
        long top=stack.peek();
        if (top>0){
            return (int)(top+min);
        }else{
            return (int)(min);
        }
    }

    public int getMin() {
        return (int)min;
    }
}