package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Kyle on 2017/10/26.
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int n = map.get(nums[i]) + 1;
                map.replace(nums[i], n);
            } else {
                map.put(nums[i], 1);
            }
        }

        int majority = nums.length / 2;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > majority) {
                return entry.getKey();
            }
        }
        return -1;
    }

    public int majorityE(int[] nums) {
        int count = 0;
        int res = 0;
        for (int n : nums) {
            if (count == 0) {
                res = n;
            }
            if (res != n) {
                count--;
            } else {
                count++;
            }
        }
        return res;
    }

}
