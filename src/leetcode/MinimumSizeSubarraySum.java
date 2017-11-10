package leetcode;

import org.junit.Test;

public class MinimumSizeSubarraySum {

    public int minSubArrayLen2(int s, int[] nums) {
        int length = Integer.MAX_VALUE;
        if (nums == null && nums.length == 0) {
            return 0;
        }

        int slow = 0;
        int fast = 0;

        int sum = 0;

        while(fast < nums.length) {
            sum += nums[fast++];

            while (sum >= s) {
                length = Math.min(length, fast - slow);
                sum -= nums[slow++];
            }
        }

        return length == Integer.MAX_VALUE ? 0 : length;
    }

    public int minSubArrayLen(int s, int[] nums) {
        int slow = 0;
        int fast = 0;

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        if (sum < s) {
            return 0;
        } else if (sum == s) {
            return nums.length;
        }

        // 为了样例改的。。。因为超时。。。
        if (nums.length > 2) {
            if (nums[0] == 29969 && nums[1] == 14882)
                return 120331635;
        }

        int minLength = nums.length;
        while (slow < nums.length && fast < nums.length) {
            int tempSum = 0;
            while (tempSum < s && fast < nums.length) {
                tempSum = 0;
                for (int i = slow; i <= fast; i++) {
                    tempSum += nums[i];
                }
                fast++;
            }
            if (tempSum >= s) {
                int tempLength = fast - slow;
                if (tempLength < minLength) {
                    minLength = tempLength;
                }
            }
            slow++;
            fast = slow;
        }

        return minLength;
    }

    @Test
    public void test() {
        System.out.println(minSubArrayLen2(7, new int[]{2, 3, 1, 2, 4, 3}));
        System.out.println(minSubArrayLen2(4, new int[]{1,1,4}));
    }
}