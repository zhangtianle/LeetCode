/*
 * @lc app=leetcode.cn id=32 lang=java
 *
 * [32] 最长有效括号
 */

// @lc code=start

import java.util.Stack;

class Solution {
    public int longestValidParentheses(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        Stack<Integer> stack = new Stack<>();
        stack.add(-1);
        int maxLen = 0;
        for(int i=0;i<s.length(); i++) {
            if (s.charAt(i)=='(') {
                stack.add(i);
            } else {
                if (!stack.isEmpty()) {
                    stack.pop();
                    if (!stack.isEmpty()) {
                        maxLen = Math.max(maxLen, i - stack.peek());
                    } else {
                        stack.add(i);
                    }
                }
            }
        }
        return maxLen;
    }

    public int longestValidParentheses2(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        int sLen = s.length();
        int len = s.length();
        while (len > 0) {
            for (int i = 0; i <= sLen - len; i++) {
                String ss = s.substring(i, len + i);
                if (isVaild(ss)) {
                    return len;
                }
            }
            len--;
        }
        return 0;
    }

    private boolean isVaild(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.add('(');
            } else if (s.charAt(i) == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else {
                return false;
            }
        }
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
// @lc code=end
