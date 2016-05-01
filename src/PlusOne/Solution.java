package PlusOne;

import org.junit.Test;

/**
 * Created by Tianle Zhang on 2016/5/1.
 */
public class Solution {
    public int[] plusOne(int[] digits) {
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
        int[] i = new int[]{9,8,7,6,5,4,3,2,1,0};
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
