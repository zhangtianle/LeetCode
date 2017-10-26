package leetcode.ValidParentheses;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by Tianle Zhang on 2016/5/24.
 */
public class Solution {
    public boolean isValid(String s) {

        boolean reslut = true;

        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        Stack<Character> stack = new Stack();
        for (int i = 0; i < s.length(); i++) {
            char ss = s.charAt(i);
            if (map.containsKey(ss)) {
                stack.push(map.get(ss));
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    char ps = stack.pop();
                    if (ps != ss) {
                        return false;
                    }
                }
            }
        }
        if (!stack.isEmpty()) {
            return false;
        }
        return reslut;
    }
}
