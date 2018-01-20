package codingInterviews;

import org.junit.Test;

public class Power {
    public double power(double base, int exponent) {
        double result = 1;
        if (base == 0 && exponent == 0) {
            return 0;
        } else if (exponent == 0) {
            return 1;
        } else if (exponent > 0) {
            for (int i = 0; i < exponent; i++) {
                result *= base;
            }
        } else if (exponent < 0) {
            exponent = - exponent;
            for (int i = 0; i < exponent; i++) {
                result *= base;
            }
            result =  1 / result;
        }
        return result;
    }

    @Test
    public void test() {
        System.out.println(power(2,-3));
    }
}
