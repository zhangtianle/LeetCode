package codingInterviews;

import org.junit.Test;

public class ReplaceSpace {
    public String replaceSpace(StringBuffer str) {
        int len = str.length();
        int conut = 0;
        for (int i = 0; i < len; i++) {
            if (' ' == str.charAt(i)) {
                conut++;
            }
        }
        if (conut == 0) {
            return str.toString();
        }
        int newLength = len + conut * 2;
        str.setLength(newLength);

        int oldIndex = len - 1;
        int newIndex = str.length() - 1;

        while (oldIndex != newIndex) {
            if (str.charAt(oldIndex) != ' ') {
                str.setCharAt(newIndex--, str.charAt(oldIndex));
            } else {
                str.setCharAt(newIndex--, '0');
                str.setCharAt(newIndex--, '2');
                str.setCharAt(newIndex--, '%');
            }
            oldIndex--;
        }
        return str.toString();
    }

    @Test
    public void test() {
        System.out.println(replaceSpace(new StringBuffer("")));
    }
}
