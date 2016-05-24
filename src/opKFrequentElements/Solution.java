package opKFrequentElements;

import org.junit.Test;

import java.util.*;

/**
 * Given a non-empty array of integers, return the k most frequent elements.
 * For example,
 * Given [1,1,1,2,2,3] and k = 2, return [1,2].
 *
 * Note:
 * You may assume k is always valid, 1 ≤ k ≤ number of unique elements.
 * Your algorithm's time complexity must be better than O(n log n), where n is the array's size.
 *
 * Created by Tianle Zhang on 2016/5/24.
 */
public class Solution {

    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> result = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for (int n : nums) {
            if (!map.containsKey(n)) {
                map.put(n,1);
            } else {
                int i = map.get(n);
                map.put(n,++i);
            }
        }
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>();
        list.addAll(map.entrySet());
        Solution.ValueComparator vc = new ValueComparator();
        Collections.sort(list,vc);
        int i = 0;
        for(Iterator<Map.Entry<Integer,Integer>> it = list.iterator(); i < k; i++)
        {
            result.add(it.next().getKey());
        }
        return result;
    }

    private class ValueComparator implements Comparator<Map.Entry<Integer, Integer>> {

        @Override
        public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
            return o2.getValue() - o1.getValue();
        }
    }

    @Test
    public void test() {
        List list = topKFrequent(new int[]{1,1,2,2,3,1,1,2}, 2);

    }
}
