package leetcode;

import org.junit.Test;

/**
 * Created by Kyle on 2017/10/26.
 */
public class ExcelSheetColumnTitle {
    public String convertToTitle(int n) {
        StringBuffer stringBuffer = new StringBuffer();
        while (n > 0) {
            int remainder = --n % 26;
            char c = (char) ('A' + remainder);
            stringBuffer.append(c);
            n = n / 26;
        }
        stringBuffer = stringBuffer.reverse();
        return stringBuffer.toString();
    }

    @Test
    public void test() {
        System.out.println(convertToTitle(52));
    }
}
