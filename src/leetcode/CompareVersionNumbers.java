package leetcode;

import org.junit.Test;

/**
 * Created by Kyle on 2017/11/26.
 */
public class CompareVersionNumbers {
    public int compareVersion(String version1, String version2) {
        int result = 0;

        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");

        int maxLength = Math.max(v1.length, v2.length);
        for (int i = 0; i < maxLength; i++) {
            int i1 = i < v1.length ? Integer.parseInt(v1[i]) : 0;
            int i2 = i < v2.length ? Integer.parseInt(v2[i]) : 0;
            if (i1 > i2) {
                result = 1;
                return result;
            } else if (i1 < i2) {
                result = -1;
                return result;
            }
        }

        return result;
    }

    @Test
    public void test() {
        System.out.println(compareVersion("1.0", "1.1"));
    }
}
