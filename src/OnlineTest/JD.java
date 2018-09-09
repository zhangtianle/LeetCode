package OnlineTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JD {


    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static int solve(String S, String T) {

        int count = 0;

        for (int i = 0; i <= S.length() - T.length(); i++) {

            boolean flag = true;
            Map<Character, Character> map = new HashMap<>();
            map.clear();
            for (int j = 0; j < T.length(); j++) {
                char ss = S.charAt(i + j);
                char tt = T.charAt(j);

                if (ss != tt) {
                    if (!map.containsKey(tt)) {
                        map.put(tt, ss);
                    } else {
                        if (map.get(tt) != ss) {
                            flag = false;
                            break;
                        }
                    }
                }
            }
            if (flag) {
                count++;
            }
        }
        return count;
    }

    /******************************结束写代码******************************/


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;

        String _S;
        try {
            _S = in.nextLine();
        } catch (Exception e) {
            _S = null;
        }

        String _T;
        try {
            _T = in.nextLine();
        } catch (Exception e) {
            _T = null;
        }

        res = solve(_S, _T);
        System.out.println(String.valueOf(res));

    }
}
