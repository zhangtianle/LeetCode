package leetcode;

import org.junit.Test;

import java.util.regex.Pattern;

/**
 * Created by Kyle on 2017/7/5.
 */
public class NumberofSegmentsinaString {
    public int countSegments(String s) {
        if (s == null || s.length() == 0) return 0;
        if (Pattern.matches("\\s+", s)) return 0;
        return s.trim().split("\\s+").length;
    }

    @Test
    public void test() {
        System.out.println(countSegments("    "));
    }
}
