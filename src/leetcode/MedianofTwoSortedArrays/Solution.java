package leetcode.MedianofTwoSortedArrays;

import java.util.HashSet;

/**
 * Created by Tianle Zhang on 2016/4/23.
 */
public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // TODO
        int m = nums1.length;
        int n = nums2.length;
        HashSet<Integer> s = new HashSet<>();
        for (int i : nums1) {
            s.add(i);
        }
        for (int i : nums2) {
            s.add(i);
        }
        if ((m+n)%2 == 1) {
            int i = s.size() / 2;
            int k = 0;
            for (int j : s) {
                k++;
                if (k==i+1) {
                    return j;
                }
            }
        }
        return 1.1;
    }
}
