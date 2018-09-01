package leetcode;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Kyle on 2017/11/4.
 */
public class WordBreak {

    public boolean wordBreak(String s, List<String> wordDict) {

        Set<String> set = new HashSet<>();
        set.addAll(wordDict);
        boolean[] f = new boolean[s.length()+1];
        f[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (f[j] && set.contains(s.substring(j, i))) {
                    f[i] = true;
                    break;
                }
            }
        }
        return f[s.length()];
    }


}
