package OnlineTest;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PDD3 {
    /**
     * 动态规划，记 f(n) 为 所在位置
     * 如果 n 为 负 ，变为正
     * f(0) = 0
     * f(1) = f(0) + 1 || f(0) - 1
     * ...
     * f(n) = f(n - 1) + n || f(n - 1) - n
     * <p>
     * 求 f(n) 能否等于target
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int t = scanner.nextInt();
            if (t < 0) {
                t = -1 * t;
            }
            int i;

            for (i = 0; i <= t; i++) {
                Set<Integer> f = getF(i);
                if (f.contains(t)) {
                    System.out.println(i);
                    break;
                }
            }
            if (i == t + 1) {
                System.out.println(-1);
            }
        }
    }

    private static Set<Integer> getF(int n) {
        Set<Integer> set = new HashSet<>();
        if (n == 0) {
            set.add(0);
            return set;
        }
        Set<Integer> fsets = getF(n - 1);
        for (int i : fsets) {
            set.add(i + n);
            set.add(i - n);
        }
        return set;
    }
}
