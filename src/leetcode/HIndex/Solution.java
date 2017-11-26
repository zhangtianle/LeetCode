package leetcode.HIndex;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by Tianle Zhang on 2016/5/25.
 */
public class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int j = 0;
        for (int i = citations.length - 1; i >= 0; i--) {
            if (citations[i] > j) {
                j = Math.min(++j, citations[i]);
            } else {
                break;
            }
        }
        return j;
    }

    @Test
    public void test() {
        System.out.println(hIndex(new int[]{3}));
    }
}
