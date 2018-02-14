package codingInterviews;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArrayForMinNumber {
    public String PrintMinNumber(int [] numbers) {

        if (numbers == null || numbers.length == 0) {
            return "";
        }
        List<String> list = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            list.add(numbers[i] + "");
        }
        Collections.sort(list, (o1, o2) -> {
            String o1o2 = o1 + o2;
            String o2o1 = o2 + o1;

            int result = 0;
            if (o1o2.equals(o2o1)) {
                return result;
            }

            for (int i = 0; i < o1o2.length(); i++) {
                if (o1o2.charAt(i) == o2o1.charAt(i)) {
                    continue;
                } else if (o1o2.charAt(i) > o2o1.charAt(i)) {
                    result = 1;
                    break;
                } else {
                    result = -1;
                    break;
                }
            }
            return result;
        });

        StringBuffer minString = new StringBuffer();
        for (String l : list) {
            minString.append(l);
        }
        return minString.toString();
    }

    @Test
    public void test() {
        System.out.println(PrintMinNumber(new int[]{3,32,321}));
    }
}
