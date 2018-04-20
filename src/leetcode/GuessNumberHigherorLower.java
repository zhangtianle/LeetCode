package leetcode;

/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */
public abstract class GuessNumberHigherorLower {
    public int guessNumber(int n) {
        int lo = 1;
        int hi = n;
        int mid = lo + ((hi - lo) >> 1);
        while (lo <= hi) {
            mid = lo + ((hi - lo) >> 1);
            if (guess(mid) == 0) {
                return mid;
            } else if (guess(mid) == -1) {
                hi = mid - 1;
            } else if (guess(mid) == 1) {
                lo = mid + 1;
            }
        }
        return mid;
    }

    abstract int guess(int num);
}
