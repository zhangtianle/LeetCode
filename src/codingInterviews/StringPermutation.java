package codingInterviews;


import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

public class StringPermutation {

    ArrayList<String> arrayList = new ArrayList<>();

    public ArrayList<String> Permutation(String str) {
        if (str == null || str.length() == 0) {
            return arrayList;
        }
        getPermutation(str, 0);
        Collections.sort(arrayList);
        return arrayList;
    }

    private void getPermutation(String str, int begin) {
        if (begin == str.length() && !arrayList.contains(str)) {
            arrayList.add(str);
        } else {
            for (int i = begin; i < str.length(); i++) {
                String s = str;
                char c = str.charAt(i);
                StringBuffer stringBuffer = new StringBuffer(str);
                stringBuffer.setCharAt(i, stringBuffer.charAt(begin));
                stringBuffer.setCharAt(begin, c);
                str = stringBuffer.toString();

                getPermutation(str, begin+1);

                str = s;
            }
        }

    }

    @Test
    public void test() {
        Permutation("");
    }
}
