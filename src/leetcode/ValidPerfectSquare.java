package leetcode;

public class ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        if (num == 1) {
            return true;
        }
        int min = num >> 1;
        while (min > 0) {
            if (min * min == num) {
                return true;
            }
            min--;
        }
        return false;
    }
}
