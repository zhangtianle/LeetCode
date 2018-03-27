package leetcode;

public class Hammingdistance {
    public int hammingDistance(int x, int y) {
        int xor = x ^ y;
        int count = 0;
        while (xor != 0) {
            if ((xor & 1) == 1) {
                count++;
            }
            xor = xor >> 1;
        }
        return count;
    }
}
