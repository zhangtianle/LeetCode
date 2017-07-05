import org.junit.Test;

/**
 * Created by Kyle on 2017/7/5.
 */
public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote == null || ransomNote.length() == 0) return true;
        if (magazine == null || magazine.length() == 0) return false;
        char[] ranChars = ransomNote.toCharArray();
        char[] magChars = magazine.toCharArray();
        for (char c : ranChars) {
            int i = 0;
            for (i = 0; i < magazine.length(); i++) {
                if (c == magChars[i] && magChars[i] != ' ') {
                    magChars[i] = ' ';
                    break;
                }
            }
            if (i == magazine.length()) {
                return false;
            }
        }
        return true;
    }

    @Test
    public void test() {
        System.out.println(canConstruct("ac", "ba"));
    }
}
