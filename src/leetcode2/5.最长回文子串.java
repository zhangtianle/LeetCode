/*
 * @lc app=leetcode.cn id=5 lang=java
 *
 * [5] 最长回文子串
 */

// @lc code=start
class Solution {
    public String longestPalindrome(String s) {
        int length = s.length();
        while(length > 0) {
            for(int i=0; i<s.length()+1-length; i++) {
                String subString = s.substring(i, i+length);
                if(isHuiwen(subString)) {
                    return subString;
                }
            }
            length--;
        }
        return "";
    }

    private boolean isHuiwen(String s) {
        int i = 0;
        int j = s.length()-1;
        while(i<j) {
            if(s.charAt(i)==s.charAt(j)) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }
}
// @lc code=end

