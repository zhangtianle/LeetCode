package leetcode;

import org.junit.Test;

/**
 *  Given two binary strings, return their sum (also a binary string).
 *
 *  For example,
 *
 *  a = "11"
 *  b = "1"
 *  Return "100".
 *
 * Created by Tianle Zhang on 2016/9/28.
 */
public class AddBinary {
    public String addBinary(String a, String b) {

        // 保证a是最长的
        if (a.length() < b.length()) {
            String temp = b;
            b = a;
            a = temp;
        }

        String result = "";
        int aIndex = a.length() - 1;
        int bIndex = b.length() - 1;
        int flag = 0;

        while (bIndex >= 0) {
            int sum = (int)(a.charAt(aIndex) - '0') + (int)(b.charAt(bIndex) - '0') + flag;
            result = String.valueOf(sum % 2) + result;
            flag = sum / 2;
            bIndex--;
            aIndex--;
        }

        while (aIndex >= 0) {
            int sum = (int)(a.charAt(aIndex) - '0') + flag;
            result = String.valueOf(sum % 2) + result;
            flag = sum / 2;
            aIndex--;
        }

        if (flag == 1) {
            result = "1" + result;
        }

        return result;
    }

    @Test
    public void test() {
        System.out.println(addBinary("", ""));
    }
}
