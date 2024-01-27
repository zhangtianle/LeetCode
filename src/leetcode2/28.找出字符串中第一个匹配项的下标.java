/*
 * @lc app=leetcode.cn id=28 lang=java
 *
 * [28] 找出字符串中第一个匹配项的下标
 */

// @lc code=start
class Solution {
    public int strStr(String haystack, String needle) {
        for (int i = 0; i < haystack.length(); i++) {
            int t = i;
            for (int j = 0; j < needle.length(); j++) {
                
                if (t < haystack.length() && haystack.charAt(t) == needle.charAt(j)) {
                    if (t-i == needle.length()-1 ) {
                        return i;
                    }
                    t++;
                } else {
                    continue;
                }
            }
        }
        return -1;
    }
}
// @lc code=end

