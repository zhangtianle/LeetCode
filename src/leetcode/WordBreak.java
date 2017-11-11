package leetcode;

import java.util.List;

/**
 * Created by Kyle on 2017/11/4.
 */
public class WordBreak {

    public boolean wordBreak(String s, List<String> wordDict) {

        // TODO
        boolean res = false;
        for(String e : wordDict) {
            if (s.contains(e)) {
                res = true;
            }
        }
        return res;
    }


}
