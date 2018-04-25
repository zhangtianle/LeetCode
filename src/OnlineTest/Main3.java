package OnlineTest;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.ArrayList;

public class Main3 {
    public static int core(char[] chars) {
        if (chars == null || chars.length == 0)
            return 0;
        int[] result = {0};
        core(chars, 0, new LinkedList<Character>(), result);
        return result[0];
    }

    public static void core(char[] chars, int start, LinkedList<Character> path, int[] count) {
        System.out.println(path);
        if (!path.isEmpty()) {
            boolean flag = true;
            for (int i = 0; i <= path.size() / 2; i++) {
                if (path.get(i) != path.get(path.size() - 1 - i)) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                count[0] += 1;
        }
        for (int i = start; i < chars.length; i++) {
            path.addLast(chars[i]);
            core(chars, i + 1, path, count);
            path.removeLast();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.next();
            char[] chars = str.toCharArray();
            System.out.println(core(chars));
        }

    }
}