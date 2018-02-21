package codingInterviews;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWordsInSentence {
    public String ReverseSentence(String str) {
        if (str == null || str.length() == 0 || str.trim().equals("")) {
            return str;
        }

        String[] strings = str.split(" ");
        List<String> list = Arrays.asList(strings);
        Collections.reverse(list);
        StringBuffer stringBuffer = new StringBuffer();
        for (String l : list) {
            stringBuffer.append(l + " ");
        }
        return stringBuffer.substring(0, stringBuffer.length() - 1);
    }

    @Test
    public void test() {
        System.out.println(ReverseSentence(" "));
    }
}
