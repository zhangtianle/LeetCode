package codingInterviews;

import org.junit.Test;

public class LeftRotateString {
    public String LeftRotateString(String str,int n) {
        if (str == null || str.length() == 0 || n < 0 || n > str.length()) {
            return "";
        }
        char[] chars = str.toCharArray();
        char[] result = new char[str.length()];

        for (int i = 0; i < str.length() - n; i++) {
            result[i] = chars[i + n];
        }
        for (int i = 0; i < n; i++) {
            result[i + str.length() - n] =  chars[i];
        }
        String s = new String(result);
        return s;
    }

    @Test
    public void test() {
        System.out.println(LeftRotateString("abcde", 6));
    }
}
