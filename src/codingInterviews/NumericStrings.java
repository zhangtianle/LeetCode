package codingInterviews;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumericStrings {

    public boolean isNumeric(char[] str) {
        if (str == null || str.length == 0) {
            return false;
        }
        Pattern p = Pattern.compile("[\\-\\+]?\\d*(\\.?\\d+)?([eE][\\+\\-]?\\d+)?");
        String s = new String(str);
        Matcher m = p.matcher(s);
        return m.matches();
    }

    @Test
    public void test() {
        System.out.println(isNumeric("123.45e+6".toCharArray()));
    }
}
