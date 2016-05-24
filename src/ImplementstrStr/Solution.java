package ImplementstrStr;

import org.junit.Test;

/**
 * Implement strStr().
 * Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 *
 * Created by Tianle Zhang on 2016/5/24.
 */
public class Solution {
    public int strStr(String haystack, String needle) {
        int hlength = haystack.length();
        int nlength = needle.length();
        if (hlength==0 && nlength==0) {
            return 0;
        }

        for (int i = 0; i < haystack.length()-nlength+1 ; i++) {
            String f = haystack.substring(i,i+nlength);
            if (f.equals(needle)) {
                return i;
            }
        }
        return -1;
    }

    @Test
    public void test() {
        System.out.println(strStr("1121","21"));
    }
}
