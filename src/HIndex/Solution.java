package HIndex;

import java.util.Arrays;

/**
 * Created by Tianle Zhang on 2016/5/25.
 */
public class Solution {
    public int hIndex(int[] citations) {
        // TODO
        Arrays.sort(citations);
        for (int i = 1; i < citations.length; i++) {
            if (i+1 < citations[i]) {
                return Integer.min(i-1,citations[i-1]);
            }
        }

        return 0;
    }
}
