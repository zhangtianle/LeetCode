package leetcode.FindtheDuplicateNumber;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Tianle Zhang on 2016/6/1.
 */
public class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            if (!set.contains(n)) {
                set.add(n);
            } else {
                return n;
            }
        }
        return 0;
    }

    @Test
    public void test() {
        System.out.println(findDuplicate(new int[]{1,2,5,7,3,2,4}));
    }
}
