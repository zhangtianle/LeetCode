package codingInterviews;

import org.junit.Test;

public class RegularExpressionsMatching {
    public boolean match(char[] str, char[] pattern) {
        if (str == null || pattern == null) {
            return false;
        }
        return matchCore(str, pattern, 0, 0);
    }

    private boolean matchCore(char[] str, char[] pattern, int strIndex, int patternIndex) {
        if (strIndex == str.length && patternIndex == pattern.length) {
            return true;
        }
        if (strIndex != str.length && patternIndex == pattern.length) {
            return false;
        }

        if (patternIndex + 1 < pattern.length && pattern[patternIndex + 1] == '*') {
            if ((pattern[patternIndex] == '.' && strIndex != str.length) || (strIndex != str.length && pattern[patternIndex] == str[strIndex])) {
                return matchCore(str, pattern, strIndex + 1, patternIndex + 2) || matchCore(str, pattern, strIndex + 1, patternIndex) || matchCore(str, pattern, strIndex, patternIndex + 2);
            } else {
                return matchCore(str, pattern, strIndex, patternIndex + 2);
            }
        }

        if ((pattern[patternIndex] == '.' && strIndex != str.length) || (strIndex != str.length && pattern[patternIndex] == str[strIndex])) {
            return matchCore(str, pattern, strIndex + 1, patternIndex + 1);
        }
        return false;
    }

    @Test
    public void test() {
        System.out.println(match("a".toCharArray(), ".*".toCharArray()));
    }
}
