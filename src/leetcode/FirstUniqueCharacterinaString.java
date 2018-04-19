package leetcode;

public class FirstUniqueCharacterinaString {
    public int firstUniqChar(String s) {
        int index = -1;
        if (s == null || s.length() == 0) {
            return index;
        }
        char[] chars = s.toCharArray();
        int[] map = new int[26];
        for (int i = 0; i < chars.length; i++) {
            map[chars[i] - 'a']++;
        }
        for (int i = 0; i < chars.length; i++) {
            if (map[chars[i] - 'a'] == 1) {
                return i;
            }
        }
        return index;
    }
}
