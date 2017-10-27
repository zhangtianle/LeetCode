package leetcode;

import org.junit.Test;

/**
 * Created by Kyle on 2017/10/27.
 */
public class UglyNumber {

    public boolean isUgly(int num) {
        boolean flag = false;

        if (num == 1) {
            flag = true;
        } else if (num == 0) {
            return false;
        }
        while (num % 2 == 0) {
            num = num / 2;
        }
        while (num % 3== 0) {
            num = num / 3;
        }
        while (num % 5 == 0) {
            num = num / 5;
        }
        if (num == 1) {
            flag = true;
        }

        return flag;
    }

    @Test
    public void test() {
        System.out.println(isUgly(0));
    }

}
