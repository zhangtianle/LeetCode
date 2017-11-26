package leetcode;

/**
 * Created by Kyle on 2017/11/26.
 */
public class HIndexII {
    public int hIndex(int[] citations) {
        int j = 0;
        for (int i = citations.length - 1; i >= 0; i--) {
            if (citations[i] > j) {
                j = Math.min(++j, citations[i]);
            } else {
                break;
            }
        }
        return j;
    }
}
