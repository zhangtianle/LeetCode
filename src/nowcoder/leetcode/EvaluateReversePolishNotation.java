package nowcoder.leetcode;

import java.util.Stack;

public class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            String s = tokens[i];
            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                String n1 = stack.pop();
                String n2 = stack.pop();

                int i2 = Integer.parseInt(n1);
                int i1 = Integer.parseInt(n2);

                if (s.equals("+")) {
                    stack.push(i1 + i2 + "");
                } else if (s.equals("-")) {
                    stack.push(i1 - i2 + "");
                } else if (s.equals("*")) {
                    stack.push(i1 * i2 + "");
                } else {
                    stack.push(i1 / i2 + "");
                }
            } else {
                stack.push(s);
            }
        }
        String res = stack.pop();
        return Integer.parseInt(res);
    }
}
