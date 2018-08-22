package OnlineTest;

import java.util.Scanner;

public class Huawei2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s = scanner.next();

            int l = s.length();

            char[] chars = s.toCharArray();
            int[] dp = new int[l];

            int max = 0;
            for (int i = l - 2; i >= 0; i--) {
                if (chars[i] == '(') {
                    int end = i + dp[i + 1] + 1;
                    if (end < l && chars[end] == ')') {
                        dp[i] = dp[i + 1] + 2;
                        if (end + 1 < l) {
                            dp[i] += dp[end + 1];
                        }
                    }
                }
                max = Math.max(max, dp[i]);
            }
            System.out.println(max);
        }
    }

}
