package leetcode;

import org.junit.Test;

/**
 * Created by Kyle on 2017/10/26.
 */
public class ExcelSheetColumnNumber {
    public int titleToNumber(String s) {
        double res = 0;
        for (int i = s.length()-1; i >= 0 ; i--) {
            char c = s.charAt(i);
            int index = c - 'A';
            index++;
            double n = s.length()-1-i;
            res = res + (Math.pow(26d,n)) * index;
        }
        return (int)res;
    }

    @Test
    public void test() {
        System.out.println(titleToNumber("ZZ"));
    }
}
