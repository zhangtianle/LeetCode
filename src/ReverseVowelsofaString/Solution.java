package ReverseVowelsofaString;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Tianle Zhang on 2016/7/22.
 */
public class Solution {

    public String reverseVowels2(String s) {
        char[] sc = s.toCharArray();
        int i = 0;
        int j = sc.length-1;
        while (i < j) {
            if (!isVowel(sc[i])) {
                i++;
            }
            if (!isVowel(sc[j])) {
                j--;
            }
            if (isVowel(sc[i]) && isVowel(sc[j])) {
                char temp = sc[j];
                sc[j] = sc[i];
                sc[i] = temp;
                i++;
                j--;
            }
        }
        return new String(sc);
    }

    public String reverseVowels(String s) {
        Character[] sa = new Character[s.length()];
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                l.add(i);
            } else {
                sa[i] = s.charAt(i);
            }
        }
        Collections.reverse(l);
        int end = 0;
        for (int i = 0; i < s.length(); i++) {
            if (sa[i] == null) {
                sa[i] = s.charAt(l.get(end));
                end++;
            }
        }
        String s1 = "";
        for (int i = 0; i < sa.length; i++) {
            s1 += sa[i];
        }
        return s1;
    }

    private boolean isVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            return true;
        }
        return false;
    }
    @Test
    public void test() {
        System.out.println(reverseVowels2("leotcede"));
    }
}
