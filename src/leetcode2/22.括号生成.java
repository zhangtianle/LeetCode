/*
 * @lc app=leetcode.cn id=22 lang=java
 *
 * [22] 括号生成
 */

// @lc code=start

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public List<String> generateParenthesis(int n) {
        Set<String> res = new HashSet<>();
        backTrack(n, n, n, "", res);
        return new ArrayList<>(res);
    }

    private void backTrack(int left, int right, int n, String s,Set<String> res) {
        if (s.length()==2*n) {
            res.add(s);
            return;
        }
        if (left>0) {
            s = s + "(";
            backTrack(left-1, right, n, s, res);
            s=s.substring(0, s.length()-1);
        } 
        if ( right>left) {
            s = s + ")";
            backTrack(left, right-1, n, s, res);
            s=s.substring(0, s.length()-1);
        }

    }
}
// @lc code=end

