package leetcode;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

    public boolean isHappy(int n) {
        if (n <=0) {
            return false;
        }
        Set<Integer> set = new HashSet<Integer>();
        int next = 0;
        while (true) {
            while (n != 0) {
                int y = n % 10;
                n = n / 10;
                next = next + y * y;
            }
            if (next == 1) {
                return true;
            }
            n = next;
            next = 0;
            if (set.contains(n)) {
                return false;
            }
            set.add(n);
        }
    }
}
