package RemoveElement;

import org.junit.Test;

/**
 * Created by Tianle Zhang on 2016/4/25.
 */
public class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        int point = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                count++;
                point = i;
                for (int j=point; j<nums.length; j++) {
                    if (nums[j] != val) {
                        break;
                    }
                    point = j;
                }
                if (point+1<nums.length) {
                    nums[i] = nums[point+1];
                }
                i = point;
            }
        }
        if (nums[nums.length - 1] == val) {
            count++;
        }
        // TODO
        return nums.length - count;
    }

    @Test
    public void test() {
        System.out.println(removeElement(new int[]{1,2,2,1,3,3,3,4,1}, 1));
    }
}
