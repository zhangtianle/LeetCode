/*
 * @lc app=leetcode.cn id=20 lang=java
 *
 * [20] 有效的括号
 */

// @lc code=start
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        if (s == null || s.length() % 2 == 1) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ( i == 0 && (c == ')' || c==']' || c=='}')) {
                return false;
            }
            if (c == '(' || c=='[' || c=='{') {
                stack.add(c);
            }
            if (c==')' ) {
                if(!stack.empty() && stack.peek()=='(' ) {
                    stack.pop();
                } else {
                    return false;
                }
            }
            if (c==']' ) {
                if( !stack.empty() && stack.peek()=='[' ) {
                    stack.pop();
                } else {
                    return false;
                }
            }
            if (c=='}' ) {
                if( !stack.empty() && stack.peek()=='{') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
// @lc code=end

