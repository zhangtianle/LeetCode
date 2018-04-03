package OnlineTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pingduoduo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int[][] point = new int[n][2];
            for (int i = 0; i < n; i++) {
                point[i][0] = scanner.nextInt();
                point[i][1] = scanner.nextInt();
            }

            int count = 0;
            for (int i = 0; i < n - 2; i++) {
                for (int j = i + 1; j < n - 1; j++) {
                    for (int k = j + 1; k < n; k++) {
                        if (sanjiao(point[i][0], point[i][1], point[j][0], point[j][1], point[k][0], point[k][1])) {
                            count++;
                        }
                    }
                }
            }
            System.out.println(count);
        }

    }

    private static boolean sanjiao(int i, int i1, int i2, int i3, int i4, int i5) {
        double l1 = Math.sqrt((i - i2) * (i - i2) + (i1 - i3) * (i1 - i3));
        double l2 = Math.sqrt((i - i4) * (i - i4) + (i1 - i5) * (i1 - i5));
        double l3 = Math.sqrt((i2 - i4) * (i2 - i4) + (i3 - i5) * (i3 - i5));

        if (l1 + l2 > l3 || l1 + l3 > l2 || l2 + l3 > l1) {
            return true;
        } else {
            return false;
        }
    }

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (n <= 0 || k <= 0 || k > n) {
            return res;
        }
        dfs(n, 2, 1, new ArrayList<Integer>(), res);
        return res;
    }

    private void dfs(int n, int k, int start, List<Integer> item, List<List<Integer>> res) {
        if (item.size() == k) {
            res.add(new ArrayList<Integer>(item));
            return;
        }
        for (int i = start; i <= n; i++) {
            item.add(i);
            dfs(n, k, i + 1, item, res);
            item.remove(item.size() - 1);
        }
    }

}
