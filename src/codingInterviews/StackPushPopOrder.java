package codingInterviews;

import org.junit.Test;

import java.util.Stack;

public class StackPushPopOrder {
    public boolean IsPopOrder(int[] pushA, int[] popA) {
        Stack<Integer> inStack = new Stack<>();
        if (pushA == null || pushA.length == 0) {
            return false;
        }
        int pushIndex = 0;
        int popIndex = 0;
        while (pushIndex != pushA.length) {
            inStack.push(pushA[pushIndex]);
            pushIndex++;
            while (popIndex < popA.length && inStack.peek() == popA[popIndex]) {
                inStack.pop();
                popIndex++;
            }
        }
        if (inStack.isEmpty()) {
            return true;
        }
        return false;
    }

    @Test
    public void test() {
        System.out.println(IsPopOrder(new int[]{1, 2, 3, 4, 5}, new int[]{4, 5, 3, 1, 2}));
    }
}
