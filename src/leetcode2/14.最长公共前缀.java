package leetcode2;

import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=14 lang=java
 * 输入：strs = ["flower","flow","flight"]
 * 输出："fl"
 *
 * [14] 最长公共前缀
 */

// @lc code=start
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null) {
            return "";
        } else if (strs.length == 1) {
            return strs[0];
        }
        int minLen = Integer.MAX_VALUE;
        for (int i=0; i< strs.length; i++) {
            if(strs[i].length() < minLen) {
                minLen = strs[i].length();
            }
        }
        int maxIndex = 0;
        Map<Integer, Character> map = new HashMap<>();
        boolean flag = false;
        for (int i = 0; i < minLen; i++) {
            for (int j = 0; j < strs.length; j++) {
                char base = strs[0].charAt(i);
                char c = strs[j].charAt(i);
                if( base != c ) {
                    return strs[0].substring(0, i);
                    // break;
                } 
                if (j == strs.length - 1) {
                    maxIndex = i;
                    flag = true;
                }
            }
        }
        if (maxIndex == 0 && flag == false) {
            return "";
        }
        return strs[0].substring(0, maxIndex+1);
    }
}
// @lc code=end

