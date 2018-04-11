package leetcode;

import java.util.HashMap;
import java.util.Map;

public class SortColors {
    public void sortColors(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        int countRed = map.get(0) == null ? 0 : map.get(0);
        int countWhite = map.get(1) == null ? 0 : map.get(1);
        for (int i = 0; i < countRed; i++) {
            nums[i] = 0;
        }
        for (int i = countRed; i < countWhite + countRed; i++) {
            nums[i] = 1;
        }
        for (int i = countWhite + countRed; i < nums.length; i++) {
            nums[i] = 2;
        }
    }
}
