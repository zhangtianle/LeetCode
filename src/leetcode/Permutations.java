package leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Kyle on 2017/10/29.
 */
public class Permutations {
    public List<List<Integer>> permute(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> lists = new ArrayList<>();

        boolean[] directions = new boolean[nums.length];
        Arrays.fill(directions, Boolean.TRUE);
        boolean[] mobiles;

        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list1.add(nums[i]);
        }
        lists.add(list1);

        lableA:
        while (true) {

            int count = 0;
            int max = Integer.MIN_VALUE;
            int maxIndex = 0;

            mobiles = containMobile(directions, nums);
            for (int i = 0; i < nums.length; i++) {
                if (mobiles[i]) {
                    count++;
                    if (nums[i] > max) {
                        max = nums[i];
                        maxIndex = i;
                    }
                }
            }
            if (count == 0) {
                break lableA;
            }

            // false right, true left
            if (directions[maxIndex] == false) {
                int temp = nums[maxIndex + 1];
                nums[maxIndex + 1] = nums[maxIndex];
                nums[maxIndex] = temp;

                boolean d = directions[maxIndex + 1];
                directions[maxIndex + 1] = directions[maxIndex];
                directions[maxIndex] = d;
            } else {
                int temp = nums[maxIndex - 1];
                nums[maxIndex - 1] = nums[maxIndex];
                nums[maxIndex] = temp;

                boolean d = directions[maxIndex - 1];
                directions[maxIndex - 1] = directions[maxIndex];
                directions[maxIndex] = d;
            }

            // change directions when the element > max
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] > max) {
                    directions[j] = !directions[j];
                }
            }

            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                list.add(nums[i]);
            }
            lists.add(list);

        }

        return lists;
    }


    private boolean[] containMobile(boolean[] directions, int[] nums) {
        boolean[] mobiles = new boolean[nums.length];
        for (int i = 0; i < nums.length; i++) {
            mobiles[i] = mobile(directions[i], nums, i);
        }
        return mobiles;
    }

    private boolean mobile(boolean direction, int[] nums, int index) {
        if (direction == false && index != nums.length - 1) {
            if (nums[index] > nums[index + 1])
                return true;
            else
                return false;
        } else if (direction == true && index != 0) {
            if (nums[index] > nums[index - 1])
                return true;
            else
                return false;
        } else {
            return false;
        }
    }

    @Test
    public void test() {
        List<List<Integer>> lists = permute(new int[]{0,-1,1});
        System.out.println();
    }

}
