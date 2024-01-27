package leetcode2;

import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=17 lang=java
 *
 * [17] 电话号码的字母组合
 * 输入：digits = "23"
 * 输出：["ad","ae","af","bd","be","bf","cd","ce","cf"]
 */

// @lc code=start
class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        String[] numString = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        int[] ints = new int[digits.length()];
        for(int i=0; i<digits.length(); i++) {
            ints[i] = Character.getNumericValue(digits.charAt(i));
        }
        for (int i = 0; i < ints.length-1; i++) {
            String s = numString[ints[i]];
            for (int j = 0; j < s.length(); j++) {
                char sub = s.charAt(j);
                String f = numString[ints[i+1]];
                for (int k = 0; k < ints.length-1; k++) {
                    for (int l = 0; l < f.length(); l++) {
                        char ss = f.charAt(l);
                        String r = String.valueOf(sub) + String.valueOf(ss) + "";
                        result.add(r);
                    }
                }
            }
        }
        return result;
    }
}
// @lc code=end

