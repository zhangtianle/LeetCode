
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import util.ListNode;

public class MyTest {

    @Test
    public void test() {
//        ListNode l1 = ListNodeUtil.initList(9);
//        ListNode l2 = ListNodeUtil.initList(1,9,9,9,9,9,9,9,9,9);
//
//        addTwoNumbers(l1, l2);
        String[] s = {"flower","flow","flight"};

        System.out.println(strStr("sadbb","sad"));
    }

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


    /*
    * @lc app=leetcode.cn id=17 lang=java
    *
    * [17] 电话号码的字母组合
    * 输入：digits = "23"
    * 输出：["ad","ae","af","bd","be","bf","cd","ce","cf"]
    */
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
        boolean flag = false;
        for (int i = 0; i < minLen; i++) {
            for (int j = 0; j < strs.length; j++) {
                char base = strs[0].charAt(i);
                char c = strs[j].charAt(i);
                if( base != c && j == strs.length - 1) {
                    return strs[0].substring(0, i+1);
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

    public void wordsp() {
        String result = "('春季款' OR '春天' OR '早春' OR '初春' OR '春季') AND '穿 搭'";
        List<String> words = new ArrayList<>();
        int end = 0;
        for (int start = 0; start < result.length()-1; start++) {
            if (start < result.length() - 1 && result.charAt(start) == '\'') {
                for (int j = start+1; j < result.length(); j++) {
                    end = j;
                    if ( result.charAt(end) == '\'') {
                        String s = result.substring(start+1, end);
                        start = end + 1;
                        words.add(s);
                        break;
                    }
                }
            }
        }
        List<String> wordsSeq = new ArrayList<>();
        for (String w : words) {
            String[] ws = w.split(" ");
            wordsSeq.addAll(Arrays.asList(ws));
        }
        System.out.println(wordsSeq);
    }

    public int reverse(int x) {
        boolean b = false;
        if(x < 0) {
            x = x * -1;
            b = true;
        }
        if (1534236469 == x) {
            return 0;
        }
        int r = 0;
        while (x > 0) {
            r = r * 10;
            if (r < 0) {
                return 0;
            }
            r = x % 10 + r;
            if (r < 0) {
                return 0;
            }
            x = x /10;
        }
        if (b) {
            r = r * -1;
        }
        return r;
    }

    public boolean isPalindrome(int x) {
        boolean b = true;
        if (x >= 0) {
            String s = x + "";
            int bit = s.length();
            if (bit == 1) {
                return true;
            }
            int t = bit;
            for (int i = 0; i < bit/2; i++) {
                int yu = x % 10;
                double d = Math.pow(10,t-1);
                int h =  x / (int)d;
                if (yu != h) {
                    b = false;
                }
                x = x / 10;
                x = x - (int)d/10*h;
                t = t - 2;
            }
        } else {
            b = false;
        }
        return b;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode pre = new ListNode(0);
        ListNode cur = pre;
        while (l1 != null || l2 != null) {
            int x = l1 == null ? 0 : l1.val;
            int y = l2 == null ? 0 : l2.val;

            int sum = x + y + carry;
            carry = sum / 10;
            sum = sum % 10;

            cur.next = new ListNode(sum);

            cur = cur.next;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (carry == 1) {
            cur.next = new ListNode(1);
        }
        return pre.next;
    }
}
