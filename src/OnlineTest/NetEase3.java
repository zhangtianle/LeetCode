package OnlineTest;

import java.util.*;

public class NetEase3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {

            int n = scanner.nextInt();
            int[] d = new int[n];

            int[] sum = new int[n];
            for (int i = 0; i < n; i++) {
                d[i] = scanner.nextInt();
                sum[i] += d[i];
            }
            int q = scanner.nextInt();
            int[] qq = new int[q];

            int[] result = new int[q];
            for (int i = 0; i < q; i++) {
                qq[i] = scanner.nextInt();

                for (int j = 0; j < n - 1; j++) {
                    if (sum[j] < qq[i] && sum[j+1] > qq[i]) {
                        result[i] = j + 1;
                    } else {
                        result[i] = n;
                    }
                }
            }

            for (int i = 0; i < q; i++) {
                System.out.println(result[i]);
            }
        }

    }
}
