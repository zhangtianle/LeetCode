package leetcode;

import org.junit.Test;

/**
 * Created by Kyle on 2017/10/27.
 */
public class AddDigits {
    public int addDigits(int num) {
        return 1 + (num - 1) % 9;
    }

    @Test
    public void test() {
        System.out.println(addDigits(9));
    }

}
