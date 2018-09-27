package OnlineTest;

import java.util.Scanner;

public class JD2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int gn = in.nextInt();
            int gm = in.nextInt();

            int[][] g = new int[gn][gn];
            int[] color = new int[gn];
            for (int j = 0; j < gm; j++) {
                int start = in.nextInt() - 1;
                int end = in.nextInt() - 1;

                g[start][end] = 1;
                g[end][start] = 1;
            }
            if (solve(g, color))
                System.out.println("Yes");
            else
                System.out.println("No");
        }

    }

    private static boolean solve(int[][] g, int[] color) {
        if (!dfs(0, 1, g, color)) {
            return false;
        } else {
            return true;
        }
    }

    private static boolean dfs(int s, int c, int[][] g, int[] color) {
        color[s] = c;
        for (int i = 0; i < g.length; i++) {
            if (g[s][i] == 1 && color[i] == c) return false;
            if (g[s][i] == 1 && color[i] == 0 && !dfs(i, -c, g, color)) return false;
        }
        return true;
    }
}
