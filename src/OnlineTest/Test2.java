package OnlineTest;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            long[] ints = new long[n];
            for (int i = 0; i < n; i++) {
                ints[i] = in.nextLong();
            }

            for (int i = 0; i < n; i++) {
                long num = ints[i];
                boolean flag = true;
                if (num % 2 == 0) {
                    for (int j = 2; j <= num; ) {
                        if (num % j == 0 && ((num / j) % 2 != 0)) {
                            System.out.println(num / j + " " + j);
                            flag = false;
                            break;
                        }
                        j = j + 2;
                    }
                }
                if (flag) {
                    System.out.println("No");
                }
            }

        }
    }
}
