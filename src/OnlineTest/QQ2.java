package OnlineTest;

import java.util.Scanner;

public class QQ2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            int sum = x + y;

            double sqrt = Math.sqrt(1 + 8 * sum);
            double n = (sqrt - 1) / 2;

            double left = n - (int)n;
            if (left != 0) {
                System.out.println(-1);
            } else {
                int min = Math.min(x, y);

                int cur = min;
                int count = 0;
                while(cur > 0) {
                    cur -= n;
                    n--;
                    count++;
                }
                System.out.println(count);
            }
        }
    }
}
