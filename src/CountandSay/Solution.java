package CountandSay;

import org.junit.Test;

/**
 * The count-and-say sequence is the sequence of integers beginning as follows:
 * 1, 11, 21, 1211, 111221, ...
 * <p>
 * 1 is read off as "one 1" or 11.
 * 11 is read off as "two 1s" or 21.
 * 21 is read off as "one 2, then one 1" or 1211.
 * <p>
 * Given an integer n, generate the nth sequence.
 * <p>
 * Note: The sequence of integers will be represented as a string.
 * <p>
 * Created by Tianle Zhang on 2016/9/3.
 */
public class Solution {

    public String countAndSay(int n) {
        String say = "1";
        n--;
        for (int i = 0; i < n; i++) {
            say = getSay(say);
        }
        return say;
    }

    public String getSay(String sn) {
        String result = "";
        for (int i = 0; i < sn.length() - 1; i++) {
            int countc = 1;
            char c = sn.charAt(i);
            int j = i + 1;
            char cn = sn.charAt(j);
            while (c == cn) {
                j++;
                if (j < sn.length()) {
                    cn = sn.charAt(j);
                } else {
                    break;
                }
                countc++;
            }
            i = j - 1;
            if (i == sn.length() - 1) {
                countc++;
            }
            result = result + countc + c;
        }
        if (sn.length() > 1) {
            char last1c = sn.charAt(sn.length() - 1);
            char last2c = sn.charAt(sn.length() - 2);
            if (last1c != last2c) {
                result = result + 1 + last1c;
            }
        } else if (sn.length() == 1) {
            result = 1 + "" + sn.charAt(0);
        }

        return result;
    }

    @Test
    public void test() {
        System.out.println(countAndSay(10));
    }

}
