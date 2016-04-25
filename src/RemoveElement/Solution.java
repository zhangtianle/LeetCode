package RemoveElement;

import org.junit.Test;

/**
 * Created by Tianle Zhang on 2016/4/25.
 */
public class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        int point;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                count++;
                point = i;
                for (int j=point+1; j<nums.length; j++) {
                    if (nums[j] != val) {
                        break;
                    }
                    count++;
                    point = j;
                }
                for (int k=i; (k<=point+1) && ((point+1)<nums.length); k++) {
                    nums[k] = nums[point+1];
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
        System.out.println(removeElement(new int[]{1,2,1,1,4,1}, 1));
    }
}
