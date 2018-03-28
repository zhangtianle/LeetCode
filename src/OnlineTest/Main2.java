package OnlineTest;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();

            int[][] jobs = new int[2][n];
            for (int i = 0; i < n; i++) {
                jobs[0][i] = scanner.nextInt();
                jobs[1][i] = scanner.nextInt();
            }

            int[] ai = new int[m];
            for (int i = 0; i < m; i++) {
                ai[i] = scanner.nextInt();
            }

            for (int i = 0; i < m; i++) {
                int max = Integer.MIN_VALUE;
                for (int j = 0; j < n; j++) {
                    if (ai[i] >= jobs[0][j]) {
                        if (jobs[1][j] > max) {
                            max = jobs[1][j];
                        }
                    }
                }
                if (max == Integer.MIN_VALUE) {
                    max = 0;
                }
                System.out.println(max);
            }

        }

    }
}
