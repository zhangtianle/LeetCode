package UniquePaths;

import org.junit.Test;

/**
 * A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).
 * The robot can only move either down or right at any point in time.
 * The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).
 *
 * How many possible unique paths are there?
 * Note: m and n will be at most 100.
 *
 * Created by Tianle Zhang on 2016/9/27.
 */
public class Solution {

    public int uniquePaths(int m, int n) {
        long result = 1;
        for (int i = 0; i < Math.min(m - 1, n - 1); i++)
            result = result * (m + n - 2 - i) / (i + 1);
        return (int) result;
    }

    @Test
    public void test() {
        System.out.println(uniquePaths(2, 2));
    }
}
