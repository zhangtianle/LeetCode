package PlusOne;

import org.junit.Test;

/**
 * Given a non-negative number represented as an array of digits, plus one to the number.
 * The digits are stored such that the most significant digit is at the head of the list.
 *
 * Created by Tianle Zhang on 2016/5/1.
 */
public class Solution {


    public int[] plusOne(int[] digits) {
        int carry = 1;
        for (int i=digits.length-1; i>=0; i--) {
            digits[i] +=  carry;
            if (digits[i] < 10) {
                return digits;
            }
            digits[i] = 0;
        }
        int[] ret = new int[digits.length+1];
        ret[0] = 1;
        return ret;
    }


    public int[] plusOne2(int[] digits) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i : digits) {
            stringBuffer.append(i);
        }
        String s = stringBuffer.toString();
        long i = Long.parseLong(s);
        i++;
        s = i + "";
        int length = s.length();
        int[] result = new int[length];

        for (int j=0; j<length; j++) {
            result[j] = Integer.parseInt(s.charAt(j)+"");
        }
        return result;
    }

    @Test
    public void test() {
        int[] i = new int[]{9,9};
        plusOne(i);

    }

    @Test
    public void test2() {
        int i = 1;
        int k = i;
        int length = 0;
        while (i/10 != 0) {
            i = i / 10;
            length++;
        }
        System.out.println(length);
    }
}
