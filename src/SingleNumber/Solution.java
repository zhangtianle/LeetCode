package SingleNumber;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Tianle Zhang on 2016/4/23.
 */
public class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int rsum = 0;
        for (int i : nums) {
            set.add(i);
            rsum = rsum + i;
        }
        int sum = 0;
        for (int i : set) {
            sum = sum + i;
        }
        return sum * 2 - rsum;
    }

    @Test
    public void test() {
        System.out.println(singleNumber(new int[] {1,1,4,3,3,4,0}));
    }
}
